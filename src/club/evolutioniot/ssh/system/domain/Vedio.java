package club.evolutioniot.ssh.system.domain;

import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author EVolution
 * 2018年11月1日-下午9:24:00
 */
public class Vedio implements Serializable{
	private Integer vedioId;
	private String vedioName;
	private Date vedioTime;
	private Date startTime;//查询时间段开始时间
	private Date endTime;//查询时间段结束时间
	
	private Integer typeId;
	
	private Integer vedioState;
	
	private String vedioUrl;
	
	private File vedioContent;
	
	private VedioType vedioType;//vedio-vedioType 多对一 
	
	private PlayUser playUser;//user-vedio 一对多
	
	private Set<Remark> remark=new HashSet<>();//remark-vedio多对一

	
	public Integer getTypeId() {
		return typeId;
	}


	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}


	public Integer getVedioId() {
		return vedioId;
	}


	public void setVedioId(Integer vedioId) {
		this.vedioId = vedioId;
	}

	public String getVedioName() {
		return vedioName;
	}

	public void setVedioName(String vedioName) {
		this.vedioName = vedioName;
	}

	
	public VedioType getVedioType() {
		return vedioType;
	}

	public void setVedioType(VedioType vedioType) {
		this.vedioType = vedioType;
	}

	public Set<Remark> getRemark() {
		return remark;
	}

	public void setRemark(Set<Remark> remark) {
		this.remark = remark;
	}

	public Integer getVedioState() {
		return vedioState;
	}

	public void setVedioState(Integer vedioState) {
		this.vedioState = vedioState;
	}

	public String getVedioUrl() {
		return vedioUrl;
	}

	public void setVedioUrl(String vedioUrl) {
		this.vedioUrl = vedioUrl;
	}


	public PlayUser getPlayUser() {
		return playUser;
	}

	public void setPlayUser(PlayUser playUser) {
		this.playUser = playUser;
	}

	public Date getVedioTime() {
		return vedioTime;
	}

	public void setVedioTime(Date vedioTime) {
		this.vedioTime = vedioTime;
	}
	
	public File getVedioContent() {
		return vedioContent;
	}
	
	public void setVedioContent(File vedioContent) {
		this.vedioContent = vedioContent;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}


	@Override
	public String toString() {
		return "Vedio [vedioId=" + vedioId + ", vedioName=" + vedioName + ", vedioTime=" + vedioTime + ", startTime="
				+ startTime + ", endTime=" + endTime + ", typeId=" + typeId + ", vedioState=" + vedioState
				+ ", vedioUrl=" + vedioUrl + ", vedioContent=" + vedioContent + "]";
	}





}
