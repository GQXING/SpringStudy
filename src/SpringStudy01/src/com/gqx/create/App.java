package com.gqx.create;

import org.junit.Test;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class App {
	//1��ͨ��������õ�IOC���������Ķ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
		//User user=new User();
		
		//���ڣ��Ѷ���Ĵ�������spring��IOC����
		Resource resource=new ClassPathResource("com/gqx/hello/applicationContext.xml");
		//������������Bean�Ĺ����� IOC����=������+applicationContext.xml
		BeanFactory factory=new XmlBeanFactory(resource);
		//�õ����������Ķ���
		User user=(User)factory.getBean("user");
		System.out.println(user.getId());
	}
	
	//2��ֱ�ӵõ�IOC�������󣨷��㣩
	/**
	 * (1)������Ĵ���������/����
	 * Ĭ���ǵ���
	 * scope="singleton" Ĭ��ֵ����Ĭ���ǵ��� ��service/dao/�����ࡿ
	 * scope="prototype" ����				 ��Action����
	 *  
	 * (2)��ʲôʱ�򴴽�
	 * scope="prototype"  ���õ������ʱ�򣬲Ŵ���
	 * ----------��������------------
	 * ---------User���󴴽�------
	 * ---------User���󴴽�------
	 * 
	 * scope="singleton" ��������������ʼ��֮ǰ�������Ѿ�������bean��������Ӧ��ֻ��һ��
	 * ----------User���󴴽�-------------
	 * ---------��������------------
	 * 
	 * (3)���Ƿ��ӳٴ�����ֻ��scope="singleton"������Ч��
	 * lazy-init="default" Ĭ��Ϊfalse ���ӳٴ���������������ʱ�򴴽�
	 * lazy-init="true" �ӳٳ�ʼ�������õ������ʱ�򣬲Ŵ���
	 * 
	 * (4)����������֮�󣬳�ʼ��/����
	 * init-method="init_user"  ��Ӧ�����init_user�������ڶ��󴴽�֮��ִ��
	 * destroy-method="destory_user"  �������������destory����ʱִ�У�������ʵ���ࣩ
	 */
	@Test
	public void test(){
		//�õ�IOC��������Ҫ���٣�������ʵ���ࣩ
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("com/     gqx/hello/applicationContext.xml");
		System.out.println("----------��������------------");
		//��������ȡ��bean
		User user1=(User)ac.getBean("user");
		User user2=(User)ac.getBean("user");
		System.out.println(user1);
		System.out.println(user2);
		System.err.println(user1==user2);
		//������������
		ac.destroy();
	}

}
