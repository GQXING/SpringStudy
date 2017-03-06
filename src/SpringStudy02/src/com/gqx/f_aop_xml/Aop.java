package com.gqx.f_aop_xml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


public class Aop {
	public void begin(){
		System.out.println("开始事物/异常");
	}
	public void commit(){
		System.out.println("提交事物！");
	}
	public void afterReturning(){
		System.out.println("AfterReturning....");
	}
	
	public void afterThrowing(){
		System.out.println("afterThrowing....");
	}
	
	
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("环绕前：Around.....");
		Object returnValue=pjp.proceed();  //执行目标方法
		System.out.println("环绕后：Around.....");
	}
}
