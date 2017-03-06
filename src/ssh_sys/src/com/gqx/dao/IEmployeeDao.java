package com.gqx.dao;

import java.util.List;

import com.gqx.entity.Dept;
import com.gqx.entity.Employee;

public interface IEmployeeDao {
	
	void save(Employee employee);
	
	void update(Employee employee);
	
	void delete(int id);
	
	Employee findById(int id);
	
	List<Employee> getAll();
	
	//����Ա������������ѯ
	List<Employee> getAll(String employeeName);
}
