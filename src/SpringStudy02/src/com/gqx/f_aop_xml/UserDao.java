package com.gqx.f_aop_xml;



import org.springframework.stereotype.Component;
@Component
public class UserDao implements IUserDao{
	
	public void  save() {
		
		System.out.println("�Ѿ����������ˣ�");
	} 
}
