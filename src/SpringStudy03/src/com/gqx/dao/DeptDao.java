package com.gqx.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.gqx.entity.Dept;

public class DeptDao {
	//Spring �� Hibernate���ϣ�IOC����ע��
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	//���������spring
	public void save(Dept dept){
		sessionFactory.getCurrentSession().save(dept);
	}
}
