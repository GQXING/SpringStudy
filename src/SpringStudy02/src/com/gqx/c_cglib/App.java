package com.gqx.c_cglib;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class App {

	@Test
	public void test() {
		//Ŀ�����
		UserDao target=new UserDao();
		//target.getClass() ->  class com.gqx.c_cglib.UserDao
		
		//�������
		UserDao proxy=(UserDao)new ProxyFactory(target).getProxyInstance();
		//proxy.getClass() -> class com.gqx.c_cglib.UserDao$$EnhancerByCGLIB$$7ab65af5
		
		//ִ�д���ķ���
		proxy.save();
	}

}
