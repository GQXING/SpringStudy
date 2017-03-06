package com.gqx.a_static;
/**
 * 静态代理（代理对象）
 * @author 郭庆兴
 *
 */
public class UserDaoProxy implements IUserDao{
	//接受保存目标对象
	private IUserDao target;
	public UserDaoProxy(IUserDao target){
		this.target=target;
	}
	@Override
	public void save() {	//开闭原则
		System.out.println("开始事物。。。。。。。");
		target.save();	//执行目标对象的方法
		System.out.println("提交事物。。。。。。。");
	}
	
}
