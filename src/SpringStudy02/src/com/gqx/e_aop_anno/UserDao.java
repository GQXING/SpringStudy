package com.gqx.e_aop_anno;



import org.springframework.stereotype.Component;
@Component
public class UserDao implements IUserDao{
	
	public void  save() {
		System.out.println("�Ѿ����������ˣ�");
	} 
}
