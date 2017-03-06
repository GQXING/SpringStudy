package com.gqx.anno;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("service")	//userSrvice����IOC����
public class UserService {

	/*Resource���IOC��������userDao����ͬʱע�뵽��ǰ�ֶ�
	 * �൱��
	 * <bean id="" class="">
	 * 	<property name="userDao" ref="userDao"/>
	 * </bean>
	 */
	@Resource(name="userDao")
	private UserDao userDao;
	//IOC������Ĵ�������spring���ⲿ�������
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void save()  {
		userDao.save();
	}
}
