package com.gqx.h_jdbc;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/gqx/h_jdbc/bean.xml");
	
	@Test
	public void test() throws Exception {
		UserDao_c ud=(UserDao_c)ac.getBean("userDao_c");
		ud.save();
//		ud.findAll();
	}
}
