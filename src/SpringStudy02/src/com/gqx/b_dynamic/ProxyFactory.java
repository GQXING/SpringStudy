package com.gqx.b_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * �����е�Dao�����������    ��̬����
 * ���������Ҫʵ�ֽӿ�
 * @author ������
 *
 */
public class ProxyFactory {
	//ά��һ��Ŀ�����
	private Object target;
	public ProxyFactory(Object target) {
		this.target=target;
	}
	//��Ŀ���������һ���������
	public  Object getProxyInstance(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), 
				new InvocationHandler() {
					/*
					 *Object proxy��ָ������Ķ���
					 * Method method��Ҫ���õķ��� 
					 * Object[] args����������ʱ����Ҫ�Ĳ��� 
					 */
					@Override
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						// TODO Auto-generated method stub
						System.out.println("��������");
						
						//ִ��Ŀ�����ķ���
						Object returnValue=method.invoke(target, args);
						System.out.println(returnValue);
						System.out.println("�ύ����");
						
						return returnValue;
					}
				});
	}
}
