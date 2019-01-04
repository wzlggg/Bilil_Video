package club.evolutioniot.ssh.system.dao.impl;

import org.springframework.stereotype.Repository;

import club.evolutioniot.ssh.common.dao.impl.BaseDaoImpl;
import club.evolutioniot.ssh.system.dao.MenuDao;
import club.evolutioniot.ssh.system.domain.Menu;
@Repository("menuDao")
public class MenuDaoImpl extends BaseDaoImpl<Menu> implements MenuDao{

}
