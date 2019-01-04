package club.evolutioniot.ssh.system.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import club.evolutioniot.ssh.common.web.action.BaseAction;
import club.evolutioniot.ssh.system.domain.Menu;
import club.evolutioniot.ssh.system.domain.PlayUser;
import club.evolutioniot.ssh.system.service.MenuService;

@Controller("menuAction")
@Scope(value = "prototype")
public class MenuAction extends BaseAction<Menu> {
	@Autowired
	private MenuService menuService;

	private List<Menu> menuList;

	@Override
	public String execute() throws Exception {
		PlayUser userInfo = (PlayUser) ActionContext.getContext().getSession().get("userInfo");
		// 组装数据
		if (userInfo == null) {
			menuList = menuService.findMenu(null);
		}else{
			System.out.println(userInfo);// TODO
			menuList = menuService.findMenu(userInfo.getUserRole());
			System.out.println(menuList);// TODO
		}
		// 查询的菜单内容放入Session
		ActionContext.getContext().getSession().put("menuList", menuList);
		return super.execute();
	}

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

}