package club.evolutioniot.ssh.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import club.evolutioniot.ssh.system.dao.PlayUserDao;
import club.evolutioniot.ssh.system.dao.RoleDao;
import club.evolutioniot.ssh.system.dao.impl.RoleDaoImpl;
import club.evolutioniot.ssh.system.domain.PlayUser;
import club.evolutioniot.ssh.system.domain.UserRole;
import club.evolutioniot.ssh.system.domain.Vedio;
import club.evolutioniot.ssh.system.service.PlayUserService;
import club.evolutioniot.ssh.system.service.RoleService;
import club.evolutioniot.ssh.system.service.VedioService;
import club.evolutioniot.ssh.system.service.impl.RoleServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/beans.xml")
public class VedioTest {
	@Autowired
	PlayUserService userService;
	@Autowired
	VedioService vedioService;

	@Test /* ok */
	public void testVedio() {
		Vedio vedio = new Vedio();
		vedio.setVedioName("GJJTest");
		vedio.setVedioState(1);
		vedio.setVedioTime(new Date());
		vedio.setVedioUrl("D://xxx.mp4");
//		vedioService.addVedio(vedio);
		
		vedioService.selectAllVedio();
	}
	@Test
	public void testSelectByUser(){
		List<Vedio> list = vedioService.selectVedioByUserId(9);
		System.out.println(list);
	}
	
}
