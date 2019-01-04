package club.evolutioniot.ssh.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import club.evolutioniot.ssh.system.domain.Remark;
import club.evolutioniot.ssh.system.service.RemarkService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/beans.xml")
public class TestRemark {
	
	@Autowired
	RemarkService remarkService;

	@Test
	public void findRemarkCount() {
		Long findRemarkCount = this.remarkService.findRemarkCount(1);
	System.out.println(findRemarkCount);
		
	}
	@Test//ok
	public void selectRemarkByVedioId(){
		List<Remark> re = remarkService.selectRemarkByVedioId(1);
		re.stream().forEach(System.out::println);
	}
}
