package com.gqx.d_myaop2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 代理工厂
 * @author 郭庆兴
 *
 */
public class ProxyFactory {
	//目标对象
	private static Object target;
	private static Aop aop;
	//生成代理对象的方法
	public static Object getProxyInstance(Object target_,Aop aop_){
		target=target_;
		aop=aop_;
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object arg0, Method method, Object[] arg2)
							throws Throwable {
						// TODO Auto-generated method stub
						aop.begin(); 
						
						//执行目标对象的方法
						Object returnValue=method.invoke(target, arg2);
						
						aop.commit();
						return returnValue;
					}
				});
				
	}
}
