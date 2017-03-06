package com.gqx.dao;

import java.io.Serializable;

import org.hibernate.SessionFactory;

import com.gqx.entity.Employee;

public class EmployeeDao {
	//ע��sessionFactory����
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	/**  
	 * ����
	 */
	public void save(Employee employee){
		sessionFactory.getCurrentSession().save(employee);
	}
	
	/**
	 * ��ѯ
	 * @param employee
	 */
	public Employee findById(Serializable id){
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
	}
	
}
