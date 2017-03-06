package com.gqx.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private ApplicationContext ac=new ClassPathXmlApplicationContext("com/gqx/anno/bean.xml");
	
	@Test
	public void test4() {
		//从容器中获取action
		UserAction userAction=(UserAction)ac.getBean("userAction");
		userAction.execute();
	}

}
