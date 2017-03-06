package com.gqx.service;

import java.util.List;

import com.gqx.entity.Admin;
import com.gqx.entity.Employee;

public interface IEmployeeService {


	void save(Employee employee);

	void update(Employee employee);

	void delete(int id);

	Employee findById(int id);

	List<Employee> getAll();

	//根据员工名称条件查询
	List<Employee> getAll(String employeeName);
	
	//删除多个员工
	void deleteMany(int[] ids);
}
