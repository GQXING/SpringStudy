package com.gqx.create;
/**
 * 工厂，创建对象
 * @author 郭庆兴
 *
 */
public class ObjectFactory {
	//实例方法创建对象
	public User getInstance(){
		return new User(100,"调用实例方法");
	}
	
	//静态方法创建对象
	public static User getStaticInstance(){
		return new User(100,"调用静态方法");		
	}
}
