package com.gqx.d_myaop2;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
@Component
public class UserDao implements IUserDao{
	@Resource
	private Aop aop;
	public void  save() {
		System.out.println("已经保存数据了！");
	} 
}
