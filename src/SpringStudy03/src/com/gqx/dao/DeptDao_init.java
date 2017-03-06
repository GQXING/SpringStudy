package com.gqx.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.gqx.entity.Dept;

public class DeptDao_init {
	
	private static SessionFactory sessionFactory;
	static{
		sessionFactory=new Configuration().configure().buildSessionFactory();
	}
	
	public void save(Dept dept){
		//创建管理类对象，创建sessionfatory、创建session，执行操作，关闭
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(dept);
		session.getTransaction().commit();
		session.close();
	}
}
