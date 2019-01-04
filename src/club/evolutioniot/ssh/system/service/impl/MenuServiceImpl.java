package club.evolutioniot.ssh.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import club.evolutioniot.ssh.system.dao.MenuDao;
import club.evolutioniot.ssh.system.dao.impl.MenuDaoImpl;
import club.evolutioniot.ssh.system.domain.Menu;
import club.evolutioniot.ssh.system.domain.UserRole;
import club.evolutioniot.ssh.system.service.MenuService;
@Service("menuService")
public class MenuServiceImpl implements MenuService {
	@Autowired
	MenuDao menuDao=new MenuDaoImpl();
	
	@Override
	public List<Menu> findMenu(UserRole role) {
		if(role!=null){
			String whereHQL=" left outer join fetch o.userRole r where r.roleId = ? ";
			return menuDao.find(whereHQL, role.getRoleId());
		}else{
			String whereHQL = " left outer join fetch o.userRole r where r.roleId = 0";
			return menuDao.find(whereHQL);
		}
	}

}
