package com.gqx.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.gqx.dao.IDeptDao;
import com.gqx.entity.Dept;

public class DeptDao implements IDeptDao {
	
	//×¢ÈëIOC
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Dept> getAll() {
		// TODO Auto-generated method stub
		return (List<Dept>)sessionFactory.getCurrentSession().createQuery("from Dept").list();
	}

	@Override
	public Dept findById(int id) {
		// TODO Auto-generated method stub
		return (Dept)sessionFactory.getCurrentSession().get(Dept.class, id);
	}

}
