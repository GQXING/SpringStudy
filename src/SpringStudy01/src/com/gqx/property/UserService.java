package com.gqx.property;

public class UserService {
	private UserDao userDao;
	//IOC������Ĵ�������spring���ⲿ�������
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void save()  {
		userDao.save();
	}
}
