package com.gqx.hello;

import org.junit.Test;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.gqx.create.User;
public class App {
	@Test
	public void test() {
		// TODO Auto-generated method stub
		//������������
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/gqx/create/bean.xml");
		//��ȡ�����еĶ���
		User user=(User)ac.getBean("user");
		System.out.println(user);
	}

}
