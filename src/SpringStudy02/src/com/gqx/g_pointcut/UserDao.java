package com.gqx.g_pointcut;



import org.springframework.stereotype.Component;
@Component
public class UserDao implements IUserDao{
	
	public void  save() {
		
		System.out.println("已经保存数据了！");
	} 
}
