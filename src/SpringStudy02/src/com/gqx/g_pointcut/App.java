package com.gqx.g_pointcut;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/gqx/g_pointcut/bean.xml");
	
	//目标对象有实现接口，就会采用jdk代理
	@Test
	public void test() {
		IUserDao ud=(IUserDao) ac.getBean("userDao");
		System.out.println(ud.getClass());	//class com.sun.proxy.$Proxy9
		ud.save();
	}
	
	@Test
	public void testCglib() {
		OrderDao ud=(OrderDao) ac.getBean("orderDao");
		System.out.println(ud.getClass());	//class com.sun.proxy.$Proxy9
		ud.save();
	}
	
	

}
