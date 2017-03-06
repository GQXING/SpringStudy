package com.gqx.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.gqx.dao.IEmployeeDao;
import com.gqx.entity.Employee;

public class EmployeeDao extends BaseDao<Employee> implements IEmployeeDao {

	@Override
	public List<Employee> getAll(String employeeName) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Employee> list = (List<Employee>)getSessionFactory().getCurrentSession().createQuery("from Employee where emploeeName like ?")
				.setParameter(0, "%"+employeeName+"%").list();
		return list;
	}

	

}
