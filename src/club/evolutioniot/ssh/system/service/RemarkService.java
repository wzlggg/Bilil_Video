package club.evolutioniot.ssh.system.service;

import java.util.Date;
import java.util.List;

import club.evolutioniot.ssh.system.domain.PlayUser;
import club.evolutioniot.ssh.system.domain.Remark;

public interface RemarkService {
	/**
	 * 添加评论
	 * @param remark
	 */
	public void addRemark(Remark remark);
	
	/**
	 * 刪除评论，將评论状态设置为0
	 * @param remark
	 */
	public void deleteRemark(Remark remark);
	
	/**
	 * 通过评论编号查询单个具体评论
	 * return remark
	 */
	public Remark findRemarkByRemarkId(Integer remarkid);
	
	/**
	 * 通过视频的Id查询评论
	 * 正常状态下的评论
	 * @return 评论
	 */
	 public List<Remark> selectRemarkByVedioId(Integer id);
	 
	
    /**
	 * 通过的用户的Id查詢评论	
	 * -查詢正常的评论
	 * @param id
	 * @return remarkContent
	 */
		public  List<Remark>  selectRemarkByPlayUserId(Integer id);
	 
	/**
	 * 查询所有用户评论
	 * 状态位为1/0
	 * return  评论
	 */
	public List<Remark>  findAllRemark();
	
	/**
	 *查询所有正常用户评论
	 *状态位为1
	 *return  评论
	 */
	public List<Remark>  findAllRightRemark();
	
	/**
	 * 查询所有进小黑屋的评论
	 * 状态位为0
	 * return 评论
	 */
	public List<Remark> findAllBlockRemark();
	
	
	/**
	 *通过内容查询评论
	 *模糊查询
	 *return 评论remark
	 */
	public List<Remark> selectRemarkByRemarkContent(String content);
		
	/**
	 * 通过时间查询评论(未实现)
	 * 模糊查询
	 */
	public List<Remark> selectRemarkByRemarkTime(Date date);
	
	
	/**
	 *查询Remark的条数
	 */
	public Long findRemarkCount(Integer vedioId);
	
	

}
