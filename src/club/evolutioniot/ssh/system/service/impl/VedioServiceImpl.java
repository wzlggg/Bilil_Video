package club.evolutioniot.ssh.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import club.evolutioniot.ssh.common.util.ThisStaticCodes;
import club.evolutioniot.ssh.common.web.action.BaseAction;
import club.evolutioniot.ssh.system.dao.VedioDao;
import club.evolutioniot.ssh.system.domain.Vedio;
import club.evolutioniot.ssh.system.service.VedioService;

@Service("vedioService")
@Transactional
public class VedioServiceImpl implements VedioService {
	@Autowired
	private VedioDao vedioDao;

	@Override
	public void addVedio(Vedio vedio) {
		if (vedio == null)
			throw new IllegalArgumentException("");
//		vedio.setTypeId(vedio.getVedioType().getVedioTypeId());
		this.vedioDao.save(vedio);

	}

	@Override
	public void deleteVedio(Vedio vedio) {
		if (vedio == null)
			throw new IllegalArgumentException("");
		Vedio ved = this.vedioDao.findById(vedio.getVedioId());
		ved.setVedioState(0);
		ved.setRemark(null);
		this.vedioDao.update(ved);
	}

	@Override
	public List<Vedio> selectAllVedio() {
		String wherehql = " where o.vedioState = ? ";
		return this.vedioDao.find(wherehql, 1);
	}

	@Override
	public List<Vedio> selectBlockVedio() {
		String wherehql = " where o.vedioState = ? ";
		return this.vedioDao.find(wherehql, 0);
	}

	@Override
	public List<Vedio> selectVedioByName(String name) {
		String whereHQL = " where o.vedioName = ? and o.vedioState = ? ";
		return this.vedioDao.find(whereHQL, name, 1);
	}

	public List<Vedio> selectVedioByUserId(Integer id) {
		if (id == null || id <= 0)
			throw new IllegalArgumentException("");
		String whereHQL = " where o.playUser.playUserId = ? and o.vedioState != ? ";
		return this.vedioDao.find(whereHQL, id, 0);

	}

	@Override
	public Vedio findVedioById(Integer id) {
		if (id == null || id <= 0)
			throw new IllegalArgumentException("");
		String whereHQL = " where o.vedioState = ? and o.vedioId = ? ";
		Vedio vedio = null;
		try {
			vedio = this.vedioDao.find(whereHQL, 1, id).get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return vedio;
	}

	@Override
	public List<Vedio> selectNomalVedio(Vedio vedioSearch) {

		StringBuffer hql = new StringBuffer(" where o.vedioState = ?");
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add(ThisStaticCodes.VEDIO_STATE_NOMAL);
		if (vedioSearch.getVedioId() != null && vedioSearch.getVedioId() != 0) {
			hql.append(" and o.vedioId= ?");
			arrayList.add(vedioSearch.getVedioId());
		}
		if (vedioSearch.getVedioName() != null && !"".equals(vedioSearch.getVedioName())) {
			hql.append(" and o.vedioName like ? ");
			arrayList.add("%" + vedioSearch.getVedioName() + "%");
		}
		System.out.println(vedioSearch.getStartTime() != null && !"".equals(vedioSearch.getStartTime()));
		if (vedioSearch.getStartTime() != null && "".equals(vedioSearch.getStartTime())) {
			hql.append(" and o.vedioTime >= ? ");
			arrayList.add(vedioSearch.getStartTime());
		}

		if (vedioSearch.getEndTime() != null && !"".equals(vedioSearch.getEndTime())) {
			hql.append(" and o.vedioTime <= ? ");
			arrayList.add(vedioSearch.getEndTime());
		}

		String wherehql = hql.toString();
		return this.vedioDao.find(wherehql, arrayList.toArray());
	}

	@Override
	public List<Vedio> searchCommonVedio(Vedio vedio) {

		StringBuffer hql = new StringBuffer(" where o.vedioState = ?");
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add(ThisStaticCodes.VEDIO_STATE_NOMAL);
		if (vedio.getVedioId() != null && vedio.getVedioId() != 0) {
			hql.append(" and o.vedioId= ?");
			arrayList.add(vedio.getVedioId());
		}
		if (vedio.getVedioName() != null && !"".equals(vedio.getVedioName())) {
			hql.append(" and o.vedioName like ? ");
			arrayList.add("%" + vedio.getVedioName() + "%");
		}
		if(vedio.getTypeId()!=null&& vedio.getTypeId()!=0){
			hql.append(" and o.vedioType.vedioTypeId = ? ");
			arrayList.add(vedio.getTypeId());
		}
		String wherehql = hql.toString();

		return this.vedioDao.find(wherehql, arrayList.toArray());
	}

}
