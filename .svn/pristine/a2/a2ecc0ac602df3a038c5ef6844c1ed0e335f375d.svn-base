package club.evolutioniot.ssh.system.service.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import club.evolutioniot.ssh.common.util.ThisStaticCodes;
import club.evolutioniot.ssh.system.dao.RemarkDao;
import club.evolutioniot.ssh.system.domain.PlayUser;
import club.evolutioniot.ssh.system.domain.Remark;
import club.evolutioniot.ssh.system.service.RemarkService;

@Service("RemarkService")
@Transactional
public class RemarkServiceImpl implements RemarkService {

	@Autowired
	private RemarkDao remarkDao;
	
	@Override
	public void addRemark(Remark remark){
		if(remark==null)
			throw new IllegalArgumentException("");
		remark.setRemarkTime(new Date());
		remark.setRemarkState(ThisStaticCodes.REMARK_NOMAL);
		this.remarkDao.save(remark);
	}
	
	@Override
	public void deleteRemark(Remark remark) {
		if (remark==null) 
			throw new IllegalArgumentException();
		Remark newRemark= this.remarkDao.findById(remark.getRemarkId());
		newRemark.setRemarkState(0);
		this.remarkDao.update(newRemark);
		
	}
	
	@Override
	public Remark findRemarkByRemarkId(Integer remarkid){
		if(remarkid==null||remarkid<=0){
			throw new IllegalArgumentException("");
		}
		String whereHQL=" where o.remarkState = 1  and o.remarkId = ?";
		Remark remark=null;
		try {
			remark=this.remarkDao.find(whereHQL, remarkid).get(0);
    } catch (Exception e) {
			e.printStackTrace();
		}
		return remark;
	}
	
	@Override
	public List<Remark> selectRemarkByVedioId(Integer id) {
		// TODO Auto-generated method stub
		if (id==null||id<=0) 
			throw new IllegalArgumentException();
		String whereHQL=" where o.vedio.vedioId = ? and o.remarkState != ?";
		return this.remarkDao.find(whereHQL, id , 0 );
	}	
	
	@Override
	public List<Remark> selectRemarkByPlayUserId(Integer id) {
		// TODO Auto-generated method stub
		if (id==null||id<=0) 
			throw new IllegalArgumentException();
		String whereHQL=" where o.playUser.playUserId = ? and o.remarkState != ?";
		return this.remarkDao.find(whereHQL, id , 0) ;
	}
	
	@Override
	public List<Remark>  findAllRemark(){
		return this.remarkDao.findAll(); 
	}
	
	@Override
	public List<Remark> findAllRightRemark() {
		String wherehql= " where o.remarkState.remarkId= ?"; 
		return this.remarkDao.find(wherehql, 1);
	}

	@Override
	public List<Remark> findAllBlockRemark() {
		String wherehql= " where o.remarkState.remarkId= ?"; 
		return this.remarkDao.find(wherehql, 0);
	}
	



	@Override
	public List<Remark> selectRemarkByRemarkContent(String content) {
		if(content==null)
			throw new IllegalArgumentException();
		String whereHQL=" where o.remarkContent like ? and o.remarkState = ?";
		List<Remark> re = this.remarkDao.find(whereHQL, "%" + content +"%", 1);
		return re ;
	}
	@Override
	public List<Remark> selectRemarkByRemarkTime(Date date) {
		if(date==null)
			throw new IllegalArgumentException();
		String whereHQL="  where convert(varchar,o.remarkTime,120) like '"+date+"%' ";
		List<Remark> retime=this.remarkDao.find(whereHQL);
		return retime;
	}

	@Override
	public Long findRemarkCount(Integer vedioId) {
		if(vedioId<=0||vedioId==null)
			throw new IllegalArgumentException();
		String hql="select count(*) from Remark as o where o.vedio.vedioId = ?";
		return (Long) this.remarkDao.findByHQL(hql,vedioId).get(0);
	}





	

}
