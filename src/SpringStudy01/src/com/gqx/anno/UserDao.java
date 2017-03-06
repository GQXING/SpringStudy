package com.gqx.anno;

import org.springframework.stereotype.Component;
//把当前对象加入IOC容器
@Component("userDao")	//相当于bean.xml 【<bean id=userDao class="..."/>】
public class UserDao {
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("DB：保存用户!");
	}
}
