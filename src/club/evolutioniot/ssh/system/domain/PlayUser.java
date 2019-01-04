package club.evolutioniot.ssh.system.domain;

import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class PlayUser implements Serializable{
	private Integer playUserId;
	private String playUserName;
	private String playUserPassword;
	private String playUserSex;
	private Date playUserBirthday;
	private String playUserHead;
	private String playUserPhone;
	private String playUserEmail;

	private Set<Remark> remarks=new HashSet<>();//用户-评论  	一对多
	// 添加用户头像实体file类
	private File playUserHeadContent;
	
	private UserRole userRole;//fk
	
	private Set<Vedio> vedios=new HashSet<>();//一对多

	/**
	 * @Fields ck : TODO(拼接复选框
	 */
	private String ck;
	/**
	 * @Fields ids : TODO(获取多个需要删除的用户ID
	 */
	private Integer ids[];
	/**
	 * 用户角色
	 */
	private Integer playUserRoleId;
	
	public Integer getPlayUserId() {
		return playUserId;
	}

	public void setPlayUserId(Integer playUserId) {
		this.playUserId = playUserId;
	}

	public String getPlayUserName() {
		return playUserName;
	}

	public void setPlayUserName(String playUserName) {
		this.playUserName = playUserName;
	}

	public String getPlayUserPassword() {
		return playUserPassword;
	}

	public void setPlayUserPassword(String playUserPassword) {
		this.playUserPassword = playUserPassword;
	}

	public String getPlayUserSex() {
		return playUserSex;
	}

	public void setPlayUserSex(String playUserSex) {
		this.playUserSex = playUserSex;
	}

	public Date getPlayUserBirthday() {
		return playUserBirthday;
	}

	public void setPlayUserBirthday(Date playUserBirthday) {
		this.playUserBirthday = playUserBirthday;
	}

	public String getPlayUserHead() {
		return playUserHead;
	}

	public void setPlayUserHead(String playUserHead) {
		this.playUserHead = playUserHead;
	}

	public String getPlayUserPhone() {
		return playUserPhone;
	}

	public void setPlayUserPhone(String playUserPhone) {
		this.playUserPhone = playUserPhone;
	}

	public String getPlayUserEmail() {
		return playUserEmail;
	}

	public void setPlayUserEmail(String playUserEmail) {
		this.playUserEmail = playUserEmail;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}


	public Set<Vedio> getVedios() {
		return vedios;
	}

	public void setVedios(Set<Vedio> vedios) {
		this.vedios = vedios;
	}

	public File getPlayUserHeadContent() {
		return playUserHeadContent;
	}

	public void setPlayUserHeadContent(File playUserHeadContent) {
		this.playUserHeadContent = playUserHeadContent;
	}

	
	public Set<Remark> getRemarks() {
		return remarks;
	}

	public void setRemarks(Set<Remark> remarks) {
		this.remarks = remarks;
	}

	
	public String getCk() {
		return ck;
	}

	public void setCk(String ck) {
		this.ck = ck;
	}

	
	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}

	@Override
	public String toString() {
		return "PlayUser [playUserId=" + playUserId + ", playUserName=" + playUserName + ", playUserPassword="
				+ playUserPassword + ", playUserSex=" + playUserSex + ", playUserBirthday=" + playUserBirthday
				+ ", playUserHead=" + playUserHead + ", playUserPhone=" + playUserPhone + ", playUserEmail="
				+ playUserEmail + "]";
	}

}
