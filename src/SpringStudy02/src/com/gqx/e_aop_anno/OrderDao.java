package com.gqx.e_aop_anno;



import org.springframework.stereotype.Component;
@Component
public class OrderDao {
	
	public void  save() {
		System.out.println("�Ѿ����������ˣ�");
	} 
}
