package com.gqx.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gqx.service.EmployeeService;




public class App {
	
	@Test
	public void testName() throws Exception {
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean-base.xml,bean-action.xml,bean-service.xml,bean-dao.xml");
		EmployeeService employeeService=(EmployeeService)ac.getBean("employeeService");
	}
}
