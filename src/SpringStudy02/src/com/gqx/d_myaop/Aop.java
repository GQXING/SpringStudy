package com.gqx.d_myaop;

import org.springframework.stereotype.Component;

@Component 	//����IOC����
public class Aop {

	public void begin(){
		System.out.println("��ʼ����/�쳣");
	}
	
	public void commit(){
		System.out.println("�ύ���");
	}
}
