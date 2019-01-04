package club.evolutioniot.ssh.system.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import club.evolutioniot.ssh.common.web.action.BaseAction;
import club.evolutioniot.ssh.system.domain.VedioType;
import club.evolutioniot.ssh.system.service.VedioTypeService;

@Controller("vedioTypeAction")
@Scope(value="prototype")
public class VedioTypeAction extends BaseAction<VedioType>{
	@Autowired
	private VedioTypeService vedioTypeService;
	private VedioTypeAction vedioTypeAction;
	
	public void setVedioTypeAction(VedioTypeAction vedioTypeAction) {
		this.vedioTypeAction = vedioTypeAction;
	}
	
	public String allType() {
		List<VedioType> typeList = this.vedioTypeService.selectAllType();
		typeList.stream().forEach(System.out::println);
		ActionContext.getContext().getSession().put("typeList", typeList);
		return NONE;
		
	}
	
	

}
