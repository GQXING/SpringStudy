package com.gqx.anno_4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private ApplicationContext ac=new ClassPathXmlApplicationContext("com/gqx/anno_4/bean.xml");
	
	@Test
	public void test4() {
		//从容器中获取action
		UserAction userAction=(UserAction)ac.getBean("userAction");
		userAction.execute();
	}

}
