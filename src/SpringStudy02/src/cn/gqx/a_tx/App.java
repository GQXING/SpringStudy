package cn.gqx.a_tx;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@Test
	public void test() {
		//������������
		ApplicationContext ac=new ClassPathXmlApplicationContext("cn/gqx/a_tx/bean.xml");
		
		Dept dept=new Dept();
		dept.setDeptName("���۲�");
		
		DeptService deptService=(DeptService)ac.getBean("deptService");
		deptService.save(dept);
	}
	
	@Test
	public void test2() {
		//������������
		ApplicationContext ac=new ClassPathXmlApplicationContext("cn/gqx/a_tx/bean.xml");
		String[] names=ac.getBeanDefinitionNames();
		System.out.println(Arrays.toString(names));
	}

}
