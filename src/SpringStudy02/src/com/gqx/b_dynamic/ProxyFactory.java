package com.gqx.b_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 给所有的Dao创建代理对象    动态代理
 * 代理对象不需要实现接口
 * @author 郭庆兴
 *
 */
public class ProxyFactory {
	//维护一个目标对象
	private Object target;
	public ProxyFactory(Object target) {
		this.target=target;
	}
	//给目标对象生成一个代理对象
	public  Object getProxyInstance(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), 
				new InvocationHandler() {
					/*
					 *Object proxy：指被代理的对象。
					 * Method method：要调用的方法 
					 * Object[] args：方法调用时所需要的参数 
					 */
					@Override
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						// TODO Auto-generated method stub
						System.out.println("开启事物");
						
						//执行目标对象的方法
						Object returnValue=method.invoke(target, args);
						System.out.println(returnValue);
						System.out.println("提交事物");
						
						return returnValue;
					}
				});
	}
}
