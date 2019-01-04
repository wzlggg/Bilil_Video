package club.evolutioniot.ssh.system.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import club.evolutioniot.ssh.common.util.ThisStaticCodes;
import club.evolutioniot.ssh.common.web.action.BaseAction;
import club.evolutioniot.ssh.system.domain.Menu;
import club.evolutioniot.ssh.system.domain.PlayUser;
import club.evolutioniot.ssh.system.service.MenuService;
import club.evolutioniot.ssh.system.service.PlayUserService;
import club.evolutioniot.ssh.system.service.VedioService;

@Controller("backgroundAction")
@Scope(value="prototype")
public class BackgroundAction extends BaseAction<PlayUser>{
	
	private Boolean flag;
	@Autowired
	private PlayUserService playUserService;
	@Autowired
	private MenuService menuService;
	public String loginUI(){
		return "loginUI";
	}
	public String login(){
		PlayUser user = this.t;
		user = this.playUserService.Login(user, ThisStaticCodes.SYS_MANAGER);
		if (user != null) {
			// 将完整登陆用户查询出来后，对象存入Session
			ActionContext.getContext().getSession().put("usersInfo", user);
			List<Menu> menuList = menuService.findMenu(user.getUserRole());
			ActionContext.getContext().getSession().put("menus", menuList);
			return LOGIN;
		} else
			return ERROR;
	}
	
	public String userList(){
		PlayUser userInfo = this.t;
		ActionContext.getContext().put("userInfo", userInfo);
		System.out.println(userInfo);
		if(userInfo!=null){
			List<PlayUser> userList = playUserService.selectNomalUser(userInfo);
			ActionContext.getContext().put("userList", userList);
		}
		return "userList";
	}
	public String findUsers(){
		//输入框获取查询的对象
		PlayUser userInfo = this.t;
		ActionContext.getContext().put("userInfo", userInfo);
		System.out.println(userInfo);
		if(userInfo!=null){
			List<PlayUser> userList = playUserService.selectNomalUser(userInfo);
			ActionContext.getContext().put("userList", userList);
		}
		return "findUsers";
	}
	
	public String updateUsers(){
		//获取即将修改的单个对象
		PlayUser userDetail = this.t;
		//组装数据
		userDetail = playUserService.findUserById(userDetail.getPlayUserId());
		//存入Request域
		ActionContext.getContext().put("user", userDetail);
		//跳转页面
		return "updateUsers";
	}
	public String checkUser(){
		PlayUser userInfo = this.t;
		System.out.println(userInfo);
		flag = this.playUserService.selectUserByName(userInfo.getPlayUserName());
		
		return "checkUser";
	}
	/**
	 * 修改单个用户对象
	 * @return
	 */
	public String updateUser(){
		//获取表单提交数据
		PlayUser userDetail = this.t;
		System.out.println(userDetail);
		//组装数据
		PlayUser user = this.playUserService.findUserById(userDetail.getPlayUserId());
		user.setPlayUserPassword(userDetail.getPlayUserPassword());
		user.setPlayUserSex(userDetail.getPlayUserSex());
		user.setPlayUserBirthday(userDetail.getPlayUserBirthday());
		user.setPlayUserPhone(userDetail.getPlayUserPhone());
		user.setPlayUserEmail(userDetail.getPlayUserEmail());
		this.playUserService.modifyUser(user);
		ActionContext.getContext().put("user", user);
		return "updateUser";
	}
	
	public String addUserUI(){
		return "addUserUI";
	}
	/**
	 * 添加用户
	 * @return
	 */
	public String addUser(){
		PlayUser userInfo = this.t;
		this.playUserService.addUser(userInfo);
		
		return "addUser";
	}
	/**
	 * 用户删除
	 * @return
	 */
	public String deleteUser(){
		PlayUser user = this.t;
		this.playUserService.deleteUser(user);
		return "deleteUser";
	}
	
	
}
