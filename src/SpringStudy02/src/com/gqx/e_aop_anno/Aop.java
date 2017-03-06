package com.gqx.e_aop_anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component 	//����IOC����
@Aspect		//ָ����ǰ��Ϊ������
public class Aop {
	//ָ���������ʽ��˵��Ҫ������Щ������Ϊ��Щ�������ɴ������
	@Pointcut("execution(* com.gqx.e_aop_anno.*.*(..))")
	public void pointCut_(){
		
	}
	
	//ǰ��֪ͨ����ִ��Ŀ�귽��֮ǰִ��
	@Before("pointCut_()")
	public void begin(){
		System.out.println("��ʼ����/�쳣");
	}
	
	//����֪ͨ��ִ��Ŀ�귽��֮��ִ��  �������Ƿ�����쳣����ִ�У�
	@After("pointCut_()")
	public void commit(){
		System.out.println("�ύ���");
	}
	
	/*//���غ�֪ͨ������Ŀ�귽��������ִ��
	@AfterReturning("pointCut_()")
	public void afterReturning(){
		System.out.println("AfterReturning....");
	}*/
	
	/*//�쳣֪ͨ����Ŀ�귽�������쳣��ʱ��ִ��
	@AfterThrowing("pointCut_()")
	public void afterThrowing(){
		System.out.println("afterThrowing....");
	}*/
	
	//����֪ͨ������Ŀ��֮ǰ����֮��ִ��
	@Around("pointCut_()")
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("����ǰ��Around.....");
		Object returnValue=pjp.proceed();  //ִ��Ŀ�귽��
		System.out.println("���ƺ�Around.....");
	}
}
