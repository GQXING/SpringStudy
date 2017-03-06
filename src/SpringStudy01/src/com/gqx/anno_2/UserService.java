package com.gqx.anno_2;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class UserService {

	@Resource
	private UserDao userDao;
	
	
	public void save()  {
		userDao.save();
	}
}
