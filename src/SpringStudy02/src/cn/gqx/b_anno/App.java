package cn.gqx.b_anno;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@Test
	public void test() {
		//������������
		ApplicationContext ac=new ClassPathXmlApplicationContext("cn/gqx/b_anno/bean.xml");
		
		Dept dept=new Dept();
		dept.setDeptName("���۲�");
		
		DeptService deptService=(DeptService)ac.getBean("deptService");
		deptService.save(dept);
	}

}
