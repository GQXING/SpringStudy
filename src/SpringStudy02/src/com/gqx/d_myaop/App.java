package com.gqx.d_myaop;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/gqx/d_myaop/bean.xml");
	@Test
	public void test() {
		UserDao ud=(UserDao) ac.getBean("userDao");
		ud.save();
	}
}
