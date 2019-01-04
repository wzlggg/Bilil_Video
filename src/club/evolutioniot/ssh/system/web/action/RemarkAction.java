package club.evolutioniot.ssh.system.web.action;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.aspectj.util.LangUtil.ProcessController.Thrown;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import club.evolutioniot.ssh.common.web.action.BaseAction;
import club.evolutioniot.ssh.system.domain.PlayUser;
import club.evolutioniot.ssh.system.domain.Remark;
import club.evolutioniot.ssh.system.domain.Vedio;
import club.evolutioniot.ssh.system.service.MenuService;
import club.evolutioniot.ssh.system.service.PlayUserService;
import club.evolutioniot.ssh.system.service.RemarkService;
import club.evolutioniot.ssh.system.service.VedioService;

@Controller("remarkAction")
@Scope(value="prototype")
public class RemarkAction extends BaseAction<Remark> {
	@Autowired
	private RemarkService remarkService;
	private RemarkAction remarkAction;
	@Autowired
	private VedioService vedioService;
	private VedioAction vedioAction;

	//定义评论
	private List<Remark> remarkList;
	
	public void setRemarkAction(RemarkAction remarkAction) {
		this.remarkAction = remarkAction;
	}
	
	
	
	//增加评论
	public String addRemark(){
		Remark remark=this.t;
		remark.setPlayUser((PlayUser) ActionContext.getContext().getSession().get("userInfo"));
		remark.setVedio((Vedio) ActionContext.getContext().getSession().get("vedio"));

		this.remarkService.addRemark(remark);
		return "addRemark_success";
	}
	
	
	
	public String deleteRemark(){
		Remark remark=this.t;
		this.remarkService.deleteRemark(remark);
		return "deleteRemark_success";
	}
	 

	public String showRemarkByVedioId(){

		
		Vedio vedio = (Vedio) ActionContext.getContext().getSession().get("vedio");
		long vedioRemarkCount=remarkService.findRemarkCount(vedio.getVedioId());
		ActionContext.getContext().getSession().put("vedioRemarkCountInfo", vedioRemarkCount);
		
		List<Remark> remarkList = this.remarkService.selectRemarkByVedioId(vedio.getVedioId());
		
		ActionContext.getContext().getSession().put("remarkList", remarkList);
		return "showRemarkByVedioId";
		
	}
	
}
