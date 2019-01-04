package club.evolutioniot.ssh.system.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import club.evolutioniot.ssh.common.web.action.BaseAction;
import club.evolutioniot.ssh.system.domain.Vedio;
import club.evolutioniot.ssh.system.service.VedioService;

@Controller("bkVedioAction")
@Scope(value="prototype")
public class BackgroundVedioAction extends BaseAction<Vedio> {

	private static final long serialVersionUID = 1L;
	@Autowired
	private VedioService vedioService;
	
	public String vedioList(){
		Vedio vedioSearch = this.t;
		//查询框获取对象vedioSearch存入Session
		ActionContext.getContext().getSession().put("vedioSearch", vedioSearch);
		if(vedioSearch!=null){
			List<Vedio> vedioList = this.vedioService.selectNomalVedio(vedioSearch);
			vedioList.stream().forEach(System.out::println);
			//查得的list存入Request 
			ActionContext.getContext().put("vedioList", vedioList);
		}
		return  "vedioList";
	}
	/**
	 * 按需查询视频
	 * @return
	 */
	public String findVedios(){
		Vedio vedioSearch = this.t;
		System.out.println(vedioSearch);//TODO 
		//查询框获取对象vedioSearch存入Session
		ActionContext.getContext().getSession().put("vedioSearch", vedioSearch);
		if(vedioSearch!=null){
			List<Vedio> vedioList = this.vedioService.selectNomalVedio(vedioSearch);
			vedioList.stream().forEach(System.out::println);
			ActionContext.getContext().put("vedioList", vedioList);
		}
		return "findVedios";
	}
	
	public String deleteVedios(){
		
		Vedio vedio = this.t;
		this.vedioService.deleteVedio(vedio);
		
		return "deleteVedios";
	}

}
