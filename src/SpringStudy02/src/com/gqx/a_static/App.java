package com.gqx.a_static;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class App {


	@Test
	public void test() {
		//Ŀ�����
		IUserDao target=new UserDao();
		
		//����
		UserDaoProxy proxy=new UserDaoProxy(target);
		//ִ�д���ķ���
		proxy.save();
	}

}
