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
	//1、通过工厂类得到IOC容器创建的对象
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建对象
		//User user=new User();
		
		//现在，把对象的创建交给spring的IOC容器
		Resource resource=new ClassPathResource("com/gqx/hello/applicationContext.xml");
		//创建容器对象（Bean的工厂） IOC容器=工厂类+applicationContext.xml
		BeanFactory factory=new XmlBeanFactory(resource);
		//得到容器创建的对象
		User user=(User)factory.getBean("user");
		System.out.println(user.getId());
	}
	
	//2、直接得到IOC容器对象（方便）
	/**
	 * (1)、对象的创建：单例/多例
	 * 默认是单例
	 * scope="singleton" 默认值，即默认是单例 【service/dao/工具类】
	 * scope="prototype" 多例				 【Action对象】
	 *  
	 * (2)、什么时候创建
	 * scope="prototype"  在用到对象的时候，才创建
	 * ----------容器创建------------
	 * ---------User对象创建------
	 * ---------User对象创建------
	 * 
	 * scope="singleton" 在启动（容器初始化之前），就已经创建了bean，且整个应用只有一个
	 * ----------User对象创建-------------
	 * ---------容器创建------------
	 * 
	 * (3)、是否延迟创建（只对scope="singleton"单例有效）
	 * lazy-init="default" 默认为false 不延迟创建，即在启动的时候创建
	 * lazy-init="true" 延迟初始化，在用到对象的时候，才创建
	 * 
	 * (4)、创建对象之后，初始化/销毁
	 * init-method="init_user"  对应对象的init_user方法，在对象创建之后执行
	 * destroy-method="destory_user"  调用容器对象的destory方法时执行（容器用实现类）
	 */
	@Test
	public void test(){
		//得到IOC容器对象（要销毁，必须用实现类）
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("com/     gqx/hello/applicationContext.xml");
		System.out.println("----------容器创建------------");
		//从容器中取得bean
		User user1=(User)ac.getBean("user");
		User user2=(User)ac.getBean("user");
		System.out.println(user1);
		System.out.println(user2);
		System.err.println(user1==user2);
		//销毁容器对象
		ac.destroy();
	}

}
