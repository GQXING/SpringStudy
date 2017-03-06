package com.gqx.service;

import java.io.Serializable;

import com.gqx.dao.EmployeeDao;
import com.gqx.entity.Employee;

public class EmployeeService {
	//IOC×¢Èë
	private EmployeeDao employeeDao;
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public void sava(Employee employee){
		employeeDao.save(employee);
	}
	
	public Employee findById(Serializable id){
		return employeeDao.findById(id);
	}
}
