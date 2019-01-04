package club.evolutioniot.ssh.system.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * <p>
 * Title: Menu.java<／p>
 * <p>
 * Description: 菜单 <／p>
 * 
 * @author admin
 * @date 2018年8月15日
 * @version 1.0
 */
public class Menu {

	/**
	 * @Fields menuId : TODO(权限编号
	 */
	private Integer menuId;
	/**
	 * @Fields menuName : TODO(权限名称
	 */
	private String menuName;
	/**
	 * @Fields pMenuId : TODO(父级菜单
	 */
	private Integer pMenuId;
	/**
	 * @Fields menuUrl : TODO(请求的地址
	 */
	private String menuUrl;

	// 多对多
	private Set<UserRole> userRole = new HashSet<>();

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public Integer getpMenuId() {
		return pMenuId;
	}

	public void setpMenuId(Integer pMenuId) {
		this.pMenuId = pMenuId;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public Set<UserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName + ", pMenuId=" + pMenuId + ", menuUrl=" + menuUrl + "]";
	}

	
}
