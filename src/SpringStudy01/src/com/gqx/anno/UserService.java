package com.gqx.anno;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("service")	//userSrvice加入IOC容器
public class UserService {

	/*Resource会从IOC容器中找userDao对象，同时注入到当前字段
	 * 相当于
	 * <bean id="" class="">
	 * 	<property name="userDao" ref="userDao"/>
	 * </bean>
	 */
	@Resource(name="userDao")
	private UserDao userDao;
	//IOC：对象的创建交给spring的外部容器完成
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void save()  {
		userDao.save();
	}
}
