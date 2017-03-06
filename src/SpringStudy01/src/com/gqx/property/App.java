package com.gqx.property;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private ApplicationContext ac=new ClassPathXmlApplicationContext("com/gqx/property/bean.xml");
	private ApplicationContext ac2=new ClassPathXmlApplicationContext("com/gqx/property/bean_p.xml");
	@Test
	public void test() {
		User user=(User)ac.getBean("user");
		System.out.println(user);
	}

	@Test
	public void test2() {
		//从容器中获取action
		UserAction userAction=(UserAction)ac.getBean("userAction");
		userAction.execute();
	}

	@Test
	public void test3() {
		//从容器中获取action
		User user=(User)ac2.getBean("user");
		System.out.println(user);
	}
	
	@Test
	public void test4() {
		//从容器中获取action
		UserAction userAction=(UserAction)ac2.getBean("userAction");
		userAction.execute();
	}

}
