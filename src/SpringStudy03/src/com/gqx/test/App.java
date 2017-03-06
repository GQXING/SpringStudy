package com.gqx.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gqx.entity.Dept;
import com.gqx.service.DeptService;

public class App {
	//ÈÝÆ÷
	private ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
	@Test
	public void test() throws Exception {
		DeptService service=(DeptService)ac.getBean("deptService");
		System.out.println(service);
		service.save(new Dept());
	}
}
