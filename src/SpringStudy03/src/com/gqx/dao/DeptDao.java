package com.gqx.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.gqx.entity.Dept;

public class DeptDao {
	//Spring 和 Hibernate整合：IOC容器注入
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	//事物管理交给spring
	public void save(Dept dept){
		sessionFactory.getCurrentSession().save(dept);
	}
}
