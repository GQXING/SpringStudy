package com.gqx.c_cglib;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class App {

	@Test
	public void test() {
		//目标对象
		UserDao target=new UserDao();
		//target.getClass() ->  class com.gqx.c_cglib.UserDao
		
		//代理对象
		UserDao proxy=(UserDao)new ProxyFactory(target).getProxyInstance();
		//proxy.getClass() -> class com.gqx.c_cglib.UserDao$$EnhancerByCGLIB$$7ab65af5
		
		//执行代理的方法
		proxy.save();
	}

}
