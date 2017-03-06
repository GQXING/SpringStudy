package com.gqx.d_myaop;

import org.springframework.stereotype.Component;

@Component 	//加入IOC容器
public class Aop {

	public void begin(){
		System.out.println("开始事物/异常");
	}
	
	public void commit(){
		System.out.println("提交事物！");
	}
}
