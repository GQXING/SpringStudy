package com.gqx.f_aop_xml;



import org.springframework.stereotype.Component;
@Component
public class OrderDao {
	
	public void  save() {
		System.out.println("已经保存数据了！");
	} 
}
