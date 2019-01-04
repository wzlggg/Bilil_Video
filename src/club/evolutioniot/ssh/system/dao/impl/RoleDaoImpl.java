package club.evolutioniot.ssh.system.dao.impl;

import org.springframework.stereotype.Repository;

import club.evolutioniot.ssh.common.dao.impl.BaseDaoImpl;
import club.evolutioniot.ssh.system.dao.RoleDao;
import club.evolutioniot.ssh.system.domain.UserRole;

@Repository("roleDao")
public class RoleDaoImpl extends BaseDaoImpl<UserRole> implements RoleDao{

}
