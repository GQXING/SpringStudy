package com.gqx.b_dynamic;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class App {


	@Test
	public void test() {
		//Ŀ�����
		IUserDao target=new UserDao();
		/*ԭʼ��target
		System.out.println(target.getClass());
		class com.gqx.b_dynamic.UserDao
		*/
		//��Ŀ����󴴽��������
		IUserDao proxy=(IUserDao) new ProxyFactory(target).getProxyInstance();
		/*��������
		System.out.println(proxy.getClass());
		class com.sun.proxy.$Proxy4   ���ڴ��ж�̬����Ķ���
		*/
		//ִ��Ŀ�����ķ���
		proxy.save();
	}

}
