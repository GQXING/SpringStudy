package cn.gqx.a_tx;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@Test
	public void test() {
		//创建容器对象
		ApplicationContext ac=new ClassPathXmlApplicationContext("cn/gqx/a_tx/bean.xml");
		
		Dept dept=new Dept();
		dept.setDeptName("销售部");
		
		DeptService deptService=(DeptService)ac.getBean("deptService");
		deptService.save(dept);
	}
	
	@Test
	public void test2() {
		//创建容器对象
		ApplicationContext ac=new ClassPathXmlApplicationContext("cn/gqx/a_tx/bean.xml");
		String[] names=ac.getBeanDefinitionNames();
		System.out.println(Arrays.toString(names));
	}

}
