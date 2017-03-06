package com.gqx.anno_3;

import org.springframework.stereotype.Repository;
@Repository	//指定在持久层用该注解
public class UserDao {
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("DB：保存用户!");
	}
}
