package club.evolutioniot.ssh.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import club.evolutioniot.ssh.system.dao.VedioTypeDao;
import club.evolutioniot.ssh.system.domain.VedioType;
import club.evolutioniot.ssh.system.service.VedioTypeService;

@Service("vedioTypeService")
@Transactional
public class VedioTypeServiceImpl implements VedioTypeService {
	@Autowired
	private VedioTypeDao vedioTypeDao;

	@Override
	public List<VedioType> selectAllType() {
		
		return this.vedioTypeDao.findAll();
	}

}
