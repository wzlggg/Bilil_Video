package club.evolutioniot.ssh.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import club.evolutioniot.ssh.common.util.ThisStaticCodes;
import club.evolutioniot.ssh.system.dao.PlayUserDao;
import club.evolutioniot.ssh.system.domain.Menu;
import club.evolutioniot.ssh.system.domain.PlayUser;
import club.evolutioniot.ssh.system.domain.UserRole;
import club.evolutioniot.ssh.system.service.PlayUserService;

@Service("playUserService")
@Transactional
public class PlayUserServiceImpl implements PlayUserService {
	@Autowired
	private PlayUserDao playUserDao;

	@Override
	public void addUser(PlayUser user) {
		if (user == null)
			throw new IllegalArgumentException("");
		UserRole userRole = new UserRole();
		userRole.setRoleId(1);
		user.setUserRole(userRole);
		this.playUserDao.save(user);

	}

	@Override
	public void deleteUser(PlayUser user) {
		if (user == null)
			throw new IllegalArgumentException("");
		PlayUser playUser = this.playUserDao.findById(user.getPlayUserId());
		playUser.setUserRole(new UserRole(ThisStaticCodes.FAIL_USER));
		this.playUserDao.update(playUser);
	}

	@Override
	public void modifyUser(PlayUser user) {
		if (user == null)
			throw new IllegalArgumentException("");
		this.playUserDao.update(user);
	}

	@Override
	public List<PlayUser> selectAllUser() {
		return this.playUserDao.findAll();
	}

	@Override
	public List<PlayUser> selectNomalUser(PlayUser userInfo) {
		StringBuffer hql = new StringBuffer(" where o.userRole.roleId = ? ");
		//存放参数列表
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add(ThisStaticCodes.SYS_USER);
		if (userInfo.getPlayUserId() != null && userInfo.getPlayUserId() != 0) {
			hql.append(" and o.playUserId = ? ");
			arrayList.add(userInfo.getPlayUserId());
		}
		if (userInfo.getPlayUserName() != null && !"".equals(userInfo.getPlayUserName())) {
			hql.append(" and o.playUserName like ? ");
			arrayList.add("%" + userInfo.getPlayUserName() + "%");
		}
		String wherehql=hql.toString();
		return this.playUserDao.find(wherehql ,arrayList.toArray());
	}
	
	@Override
	public List<PlayUser> selectBlockUser() {
		String wherehql = " where o.userRole.roleId = ? ";
		return this.playUserDao.find(wherehql, 0);
	}

	@Override
	public PlayUser findUserById(Integer id) {
		if (id == null || id <= 0)
			throw new IllegalArgumentException("");
		String whereHQL = " where o.userRole.roleId = ? and o.playUserId = ? ";
		PlayUser user = null;
		try {
			user = this.playUserDao.find(whereHQL, 1, id).get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public PlayUser Login(PlayUser playUser, int userRole) {
		String whereHQL = " where o.playUserName = ? and o.playUserPassword = ? and o.userRole.roleId = ?";
		PlayUser loginUser = null;
		try {
			loginUser = this.playUserDao
					.find(whereHQL, playUser.getPlayUserName(), playUser.getPlayUserPassword(), userRole).get(0);
			System.out.println(loginUser);
		} catch (IndexOutOfBoundsException e) {// 未查询到结果 捕获异常
			System.err.println("账号密码不匹配");
		}
		return loginUser;
	}

	@Override
	public Boolean selectUserByName(String name) {
		String whereHQL = "where o.playUserName = ? and o.userRole.roleId != ?";
		return this.playUserDao.find(whereHQL, name, 0).size() != 0;

	}

}
