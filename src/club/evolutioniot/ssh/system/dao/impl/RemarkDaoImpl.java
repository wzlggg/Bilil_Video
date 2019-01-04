package club.evolutioniot.ssh.system.dao.impl;

import org.springframework.stereotype.Repository;

import club.evolutioniot.ssh.common.dao.impl.BaseDaoImpl;
import club.evolutioniot.ssh.system.dao.PlayUserDao;
import club.evolutioniot.ssh.system.dao.RemarkDao;
import club.evolutioniot.ssh.system.domain.PlayUser;
import club.evolutioniot.ssh.system.domain.Remark;
@Repository("remarkDao")
public class RemarkDaoImpl extends BaseDaoImpl<Remark> implements RemarkDao{

}