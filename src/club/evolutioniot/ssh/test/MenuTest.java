package club.evolutioniot.ssh.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import club.evolutioniot.ssh.system.domain.Menu;
import club.evolutioniot.ssh.system.domain.UserRole;
import club.evolutioniot.ssh.system.service.MenuService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/beans.xml")
public class MenuTest {
	@Autowired
	MenuService menuService;
	@Test
	public void testFind(){
		UserRole role=new UserRole();
		role.setRoleId(1);
		List<Menu> findMenu = menuService.findMenu(role);
		System.out.println(findMenu);
	}
	
}
