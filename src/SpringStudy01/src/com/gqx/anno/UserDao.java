package com.gqx.anno;

import org.springframework.stereotype.Component;
//�ѵ�ǰ�������IOC����
@Component("userDao")	//�൱��bean.xml ��<bean id=userDao class="..."/>��
public class UserDao {
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("DB�������û�!");
	}
}
