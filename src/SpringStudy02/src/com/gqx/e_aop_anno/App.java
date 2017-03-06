package com.gqx.e_aop_anno;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/gqx/e_aop_anno/bean.xml");
	
	//目标对象有实现接口，就会采用jdk代理
	@Test
	public void test() {
		IUserDao ud=(IUserDao) ac.getBean("userDao");
		System.out.println(ud.getClass());	//class com.sun.proxy.$Proxy9
		ud.save();
	}
	
	//目标对象没有实现接口，就会采用cglib代理
	@Test
	public void testCglib() {
		OrderDao od=(OrderDao) ac.getBean("orderDao");
		System.out.println(od.getClass());  //class com.gqx.e_aop_anno.OrderDao$$EnhancerByCGLIB$$acaafa0a
		od.save();
	}

}
