package club.evolutioniot.ssh.system.web.action;

import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.List;


import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import club.evolutioniot.ssh.common.web.action.BaseAction;
import club.evolutioniot.ssh.system.dao.VedioTypeDao;
import club.evolutioniot.ssh.system.domain.PlayUser;
import club.evolutioniot.ssh.system.domain.Remark;
import club.evolutioniot.ssh.system.domain.Vedio;
import club.evolutioniot.ssh.system.domain.VedioType;
import club.evolutioniot.ssh.system.service.MenuService;
import club.evolutioniot.ssh.system.service.PlayUserService;
import club.evolutioniot.ssh.system.service.RemarkService;
import club.evolutioniot.ssh.system.service.VedioService;

@Controller("vedioAction")
@Scope(value = "prototype")
public class VedioAction extends BaseAction<Vedio> {
	@Autowired
	private VedioService vedioService;
	private VedioAction vedioAction;
	@Autowired
	private PlayUserService playUserService;
	@Autowired
	private MenuService menuService;
	private PlayUserAction playUserAction;
	private List<Vedio> vedioList;
	@Autowired
	private VedioTypeAction vedioTypeAction;
	@Autowired
	private VedioTypeDao vedioTypeDao;
	
	public void setVedioAction(VedioAction vedioAction) {
		this.vedioAction = vedioAction;
	}

	// 定义输入流
	private InputStream inputStream;
	// 视频本体
	private List<File> file;

	public List<File> getFile() {
		return file;
	}

	public void setFile(List<File> file) {
		this.file = file;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	// 列表方法
	public String list() throws Exception {

		List<Vedio> vedioList = this.vedioService.selectAllVedio();
		ActionContext.getContext().put("vedioList", vedioList);
		return "list";

	}

	public String addUI() throws Exception {
		return "addUI";
	}

	public String delete() throws Exception {
		Vedio vedio = this.t;
		vedioService.deleteVedio(vedio);
		return "tolist";// todo
	}

	public String add() throws Exception {
		Vedio vedio = this.t;

		PlayUser userInfo = (PlayUser) ActionContext.getContext().getSession().get("userInfo");
		// 封装带对象中 保存数据库 有时候 我们也可以使用model 但是要设置为封装的属性
		// 得到文件的真实的路径
		// 文件上传成功了
		/*
		 * ServletContext application = ServletActionContext.getServletContext(); String
		 * directory = application.getRealPath("uploadfile"); String saveFilePath =
		 * directory; System.out.println(saveFilePath); //File file = new
		 * File(saveFilePath);
		 */
		// 如果指定的路径没有就创建
		File saveFilePath = new File(ServletActionContext.getServletContext().getRealPath("uploadFile"));
		if (!saveFilePath.exists()) {
			saveFilePath.mkdirs();
		}
		System.out.println(saveFilePath);
		System.out.println(vedio);

		File target = new File(saveFilePath, vedio.getVedioName() + ".mp4");
		FileUtils.copyFile(vedio.getVedioContent(), target);//TODO 

		vedio.setVedioUrl("uploadFile/" + vedio.getVedioName() + ".mp4");
		
		VedioType type=new VedioType();
		type.setVedioTypeId(vedio.getTypeId());
		vedio.setVedioType(type);
		vedio.setVedioTime(new Date());
		vedio.setVedioState(1);
		vedio.setPlayUser(userInfo);
		// 这样我们就保存了 数据的路径 我们查找的时候，根据这个路径 找到对应视频资源到的id
		vedioService.addVedio(vedio);
		return "add";
	}

	public String VedioOnline() throws Exception {
		Vedio vedio = this.t;
		List<Vedio> vedioList = this.vedioService.selectAllVedio();
		ActionContext.getContext().put("vedioList", vedioList);
		// 获取到了我们需要操作的video 的对象
		/*vedio = vedioService.findVedioById(vedio.getVedioId());
		String vedioFileName = java.net.URLEncoder.encode(vedio.getVedioName(), "UTF-8");
		String vediosavePath = java.net.URLEncoder.encode(vedio.getVedioUrl() + vedio.getVedioName(), "UTF-8");
		System.out.println("id" + vedio.getVedioId());
		ActionContext.getContext().put("vedioId", vedio.getVedioId());
		ActionContext.getContext().put("vedioName", vedioFileName);
		ActionContext.getContext().put("vediosavePath", vediosavePath);
		ActionContext.getContext().put("vedioUrl", vedio.getVedioUrl() + vedio.getVedioName());*/
		return "vedioOnLine";
	}

	public String findUI() throws Exception {
		return "findUI";

	}
	/**
	 * 通过视频Id跳转视频
	 * @return
	 * @throws vedioFind
	 */
	public String vedioFind() throws Exception {

		Vedio vedio = this.t;
		vedio = vedioService.findVedioById(vedio.getVedioId());
		ActionContext.getContext().getSession().put("vedio", vedio);
		return "vedioFind";

	}

	/**
	 * 根据用户查找视频列表，显示至前台
	 * 
	 * @author EVolution
	 * @return
	 */
	public String vedioInfo() {

		PlayUser userInfo = (PlayUser) ActionContext.getContext().getSession().get("userInfo");
		if (userInfo != null) {
			System.out.println(userInfo.getPlayUserId());// TODO
			vedioList = vedioService.selectVedioByUserId(userInfo.getPlayUserId());
			System.out.println(vedioList);// TODO
			ActionContext.getContext().getSession().put("vedioList", vedioList);
		}

		return "vedioInfo";
	}

	public List<Vedio> getVedioList() {
		return vedioList;
	}

	public void setVedioList(List<Vedio> vedioList) {
		this.vedioList = vedioList;
	}

	/**
	 * 删除视频
	 */
	public String vedioDelete() {
		Vedio vedio = this.t;
		vedio = vedioService.findVedioById(vedio.getVedioId());
		ActionContext.getContext().getSession().put("vedio", vedio);
		System.out.println("！！！"+vedio);
		vedioService.deleteVedio(vedio);
		return "vedioDelete";

	}

	public String vedioDeleteUI() {
		return "vedioDeleteUI";
	}
	/**
	 * 搜索视频
	 */
	public String vedioSearch() {
		Vedio vedio = this.t;
		
		ActionContext.getContext().put("vedio", vedio);
		System.out.println(vedio.getVedioId()+":::"+vedio.getVedioName());
		if(vedio!=null) {
			List<Vedio> vedioList=vedioService.searchCommonVedio(vedio);
			vedioList.stream().forEach(System.out::println);
			ActionContext.getContext().put("vedioList", vedioList);
			System.out.println("!!!"+vedioList);
		}
		return "vedioSearch";
		
	}
	/**
	 * 分类显示首页视频
	 */
	public String indexVedioSearch(){

		List<Vedio> vedioList = this.vedioService.selectAllVedio();
		ActionContext.getContext().getSession().put("vedioList", vedioList);
		return "indexVedioSearch";
	}

}
