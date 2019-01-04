package club.evolutioniot.ssh.system.dao.impl;

import org.springframework.stereotype.Repository;

import club.evolutioniot.ssh.common.dao.impl.BaseDaoImpl;
import club.evolutioniot.ssh.system.dao.VedioDao;
import club.evolutioniot.ssh.system.domain.Vedio;

@Repository("vedioDao")
public class VedioDaoImpl extends BaseDaoImpl<Vedio> implements VedioDao {

}
