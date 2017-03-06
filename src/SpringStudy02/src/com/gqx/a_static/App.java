package com.gqx.a_static;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class App {


	@Test
	public void test() {
		//目标对象
		IUserDao target=new UserDao();
		
		//代理
		UserDaoProxy proxy=new UserDaoProxy(target);
		//执行代理的方法
		proxy.save();
	}

}
