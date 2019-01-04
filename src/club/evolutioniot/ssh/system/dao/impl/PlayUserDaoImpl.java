package club.evolutioniot.ssh.system.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import club.evolutioniot.ssh.common.dao.impl.BaseDaoImpl;
import club.evolutioniot.ssh.system.dao.PlayUserDao;
import club.evolutioniot.ssh.system.domain.PlayUser;
@Repository("playUserDao")
public class PlayUserDaoImpl extends BaseDaoImpl<PlayUser> implements PlayUserDao{

}
