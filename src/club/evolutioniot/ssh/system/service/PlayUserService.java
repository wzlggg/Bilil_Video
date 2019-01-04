package club.evolutioniot.ssh.system.service;

import java.util.List;

import club.evolutioniot.ssh.system.domain.Menu;
import club.evolutioniot.ssh.system.domain.PlayUser;
import club.evolutioniot.ssh.system.domain.UserRole;

public interface PlayUserService {
	/**
	 * 添加用戶，用户角色为標號1
	 * @param user
	 */
	public void addUser(PlayUser user);
	/**
	 * 刪除用戶，將用戶狀態置為0
	 * @param user
	 */
	public void deleteUser(PlayUser user);
	/**
	 * 修改用戶
	 * @param user
	 */
	public void modifyUser(PlayUser user);
	/**
	 * 通過Id查詢單個用戶
	 * -只查詢正常用戶
	 * @param id
	 * @return
	 */
	public PlayUser findUserById(Integer id);
	/**
	 * 查詢所有類型的用戶
	 * @test 
	 * @return 用戶列表
	 */
	public List<PlayUser> selectAllUser();
	/**
	 * 查詢所有-正常用戶
	 * @return 用戶列表
	 */
	public List<PlayUser> selectNomalUser(PlayUser userInfo);
	/**
	 * 查詢所有-拉入小黑屋的用戶
	 * @return 用戶列表
	 */
	public List<PlayUser> selectBlockUser();
	/**
	 * 用户登陆判断,
	 * @return PlayUser用户对象|账户存在		null|账号密码不正确
	 */
	public PlayUser Login(PlayUser playUser,int userRole);
	/**
	 * 通过名字查询用户
	 * -用于用户名查重
	 * @return True| 有重複名字  <br>false|無重複名字
	 * @param name
	 */
	public Boolean selectUserByName(String name);

}
