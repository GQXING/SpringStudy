package com.gqx.d_myaop;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
@Component
public class UserDao{
	@Resource
	private Aop aop;
	public final void  save() {
		aop.begin();
		System.out.println("已经保存数据了！");
		aop.commit();
	} 	
}
