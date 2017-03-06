package com.gqx.b_dynamic;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class App {


	@Test
	public void test() {
		//目标对象
		IUserDao target=new UserDao();
		/*原始的target
		System.out.println(target.getClass());
		class com.gqx.b_dynamic.UserDao
		*/
		//给目标对象创建代理对象
		IUserDao proxy=(IUserDao) new ProxyFactory(target).getProxyInstance();
		/*对象代理后
		System.out.println(proxy.getClass());
		class com.sun.proxy.$Proxy4   在内存中动态生存的对象
		*/
		//执行目标对象的方法
		proxy.save();
	}

}
