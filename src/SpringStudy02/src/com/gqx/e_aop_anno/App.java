package com.gqx.e_aop_anno;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/gqx/e_aop_anno/bean.xml");
	
	//Ŀ�������ʵ�ֽӿڣ��ͻ����jdk����
	@Test
	public void test() {
		IUserDao ud=(IUserDao) ac.getBean("userDao");
		System.out.println(ud.getClass());	//class com.sun.proxy.$Proxy9
		ud.save();
	}
	
	//Ŀ�����û��ʵ�ֽӿڣ��ͻ����cglib����
	@Test
	public void testCglib() {
		OrderDao od=(OrderDao) ac.getBean("orderDao");
		System.out.println(od.getClass());  //class com.gqx.e_aop_anno.OrderDao$$EnhancerByCGLIB$$acaafa0a
		od.save();
	}

}
