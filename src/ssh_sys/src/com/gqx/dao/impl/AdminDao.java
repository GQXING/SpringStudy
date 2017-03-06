package com.gqx.dao.impl;

import org.hibernate.SessionFactory;

import com.gqx.dao.IAdminDao;
import com.gqx.entity.Admin;

public class AdminDao implements IAdminDao {

	//IOC容器注入sessionFactory对象
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Admin admin) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(admin);
	}

	@Override
	public Admin findByaAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return (Admin)sessionFactory.getCurrentSession()
				   .createQuery("from Admin where adminName=? and password=?")
				   .setString(0, admin.getAdminName())
				   .setString(1, admin.getPassword())
				   .uniqueResult();		//结果是唯一的时候才会用uniqueResult
	}

}
