package com.gqx.dao;

import java.io.Serializable;

import org.hibernate.SessionFactory;

import com.gqx.entity.Employee;

public class EmployeeDao {
	//注入sessionFactory对象
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	/**  
	 * 保存
	 */
	public void save(Employee employee){
		sessionFactory.getCurrentSession().save(employee);
	}
	
	/**
	 * 查询
	 * @param employee
	 */
	public Employee findById(Serializable id){
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
	}
	
}
