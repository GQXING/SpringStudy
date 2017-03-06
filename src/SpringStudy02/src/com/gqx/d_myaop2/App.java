package com.gqx.d_myaop2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/gqx/d_myaop2/bean.xml");
	@Test
	public void test() {
		IUserDao ud=(IUserDao) ac.getBean("userDao_proxy");
		ud.save();
	}
}
