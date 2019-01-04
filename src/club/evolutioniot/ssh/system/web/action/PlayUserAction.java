package club.evolutioniot.ssh.system.web.action;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import club.evolutioniot.ssh.common.util.ThisStaticCodes;
import club.evolutioniot.ssh.common.web.action.BaseAction;
import club.evolutioniot.ssh.system.dao.MenuDao;
import club.evolutioniot.ssh.system.domain.Menu;
import club.evolutioniot.ssh.system.domain.PlayUser;
import club.evolutioniot.ssh.system.service.MenuService;
import club.evolutioniot.ssh.system.service.PlayUserService;

@Controller("playUserAction")
@Scope(value = "prototype")
public class PlayUserAction extends BaseAction<PlayUser> {
	@Autowired
	PlayUserService playUserService;
	@Autowired
	MenuService menuService;
	PlayUserAction playUserAction;

	public void setPlayUserAction(PlayUserAction playUserAction) {
		this.playUserAction = playUserAction;
	}

	public String indexUI() {
		return "indexUI";
	}

	public String loginUI() {
		return "loginUI";
	}

	/**
	 * action登陆逻辑
	 * 
	 * @return
	 */
	public String login() {
		PlayUser user = this.t;
		// 查询 组装数据
		user = this.playUserService.Login(user, ThisStaticCodes.SYS_USER);
		if (user != null) {
			// 将完整登陆用户查询出来后，对象存入Session
			ActionContext.getContext().getSession().put("userInfo", user);
			return LOGIN;
		} else
			return ERROR;
	}

	public String registerUI() {
		return "registerUI";
	}

	public String register() {
		PlayUser user = this.t;
		if (!this.playUserService.selectUserByName(user.getPlayUserName())) {
			this.playUserService.addUser(user);
			return "register_success";
		} else
			return "register_fail";
	}

	/**
	 * 针对不同用户显示不同顶部菜单
	 */
	public String showMenu() {
		PlayUser user = (PlayUser) ActionContext.getContext().getSession().get("userInfo");
		List<Menu> menuList = this.menuService.findMenu(user.getUserRole());
		ActionContext.getContext().put("menuList", menuList);
		// TODO 未完成
		return "showMenu";
	}

	/**
	 * 修改信息页面跳转
	 * @return
	 */
	public String userInfo(){
		return "userInfo";

	}
	/**
	 * 添加用户头像
	 */

	private String headImgContentType;
	private String headImgFileName;

	public String getHeadImgContentType() {
		return headImgContentType;
	}

	public void setHeadImgContentType(String headImgContentType) {
		this.headImgContentType = headImgContentType;
	}

	public String getHeadImgFileName() {
		return headImgFileName;
	}

	public void setHeadImgFileName(String headImgFileName) {
		this.headImgFileName = headImgFileName;
	}

	public String addHead() {
		PlayUser user = this.t;
		PlayUser userInfo = (PlayUser) ActionContext.getContext().getSession().get("userInfo");
		
		try {
			if (user != null) {
				String filePath = ServletActionContext.getServletContext().getRealPath("upload/playUser");
				String fileName = UUID.randomUUID().toString().replaceAll("-", "")+"."
						+ "jpg";
				//headImgFileName.substring(headImgFileName.lastIndexOf(".")
//				System.out.println(filePath);
//				System.out.println(fileName);
				FileUtils.copyFile(user.getPlayUserHeadContent(), new File(filePath, fileName));

				userInfo.setPlayUserHead("upload/playUser/" + fileName);
			}
			playUserService.modifyUser(userInfo);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "addHead";

	}

	public String headUI() {
		return "headUI";

	}


	/**
	 * 修改个人信息
	 * @return
	 */
	public String userEdite(){
		//获取修改后数据
		PlayUser user = this.t;
		//组装不可修改数据
		PlayUser userInfo = (PlayUser) ActionContext.getContext().getSession().get("userInfo");
		user.setPlayUserId(userInfo.getPlayUserId());
		user.setPlayUserHead(userInfo.getPlayUserHead());
		user.setPlayUserPassword(userInfo.getPlayUserPassword());
		user.setUserRole(userInfo.getUserRole());
		
		playUserService.modifyUser(user);
		ActionContext.getContext().getSession().put("userInfo",user);
		return "userEdite";
	}
	public String vedioUI(){
		return "vedioUI";
	}

}
