package com.gqx.hello;

public class User {
	private int id;
	private String name;
	public User() {
		// TODO Auto-generated constructor stub
		System.out.println("----------User对象创建成功-------------");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void init_user() {
		// TODO Auto-generated method stub
		System.out.println("对象创建之后初始化 ！");
	}
	public void destory_user() {
		// TODO Auto-generated method stub
		System.out.println("IOC容器销毁，user对象回收！");
	}
	
}
