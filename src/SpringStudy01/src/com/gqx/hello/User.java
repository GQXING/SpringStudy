package com.gqx.hello;

public class User {
	private int id;
	private String name;
	public User() {
		// TODO Auto-generated constructor stub
		System.out.println("----------User���󴴽��ɹ�-------------");
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
		System.out.println("���󴴽�֮���ʼ�� ��");
	}
	public void destory_user() {
		// TODO Auto-generated method stub
		System.out.println("IOC�������٣�user������գ�");
	}
	
}
