package club.evolutioniot.ssh.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import club.evolutioniot.ssh.system.dao.RoleDao;
import club.evolutioniot.ssh.system.domain.UserRole;
import club.evolutioniot.ssh.system.service.RoleService;
@Service("roleService")
public class RoleServiceImpl implements RoleService{
	@Autowired
	RoleDao roleDao;
	@Override
	public void add(UserRole role) {
		roleDao.save(role);
	}

}
