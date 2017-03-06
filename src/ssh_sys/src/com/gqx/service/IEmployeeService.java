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

	//����Ա������������ѯ
	List<Employee> getAll(String employeeName);
	
	//ɾ�����Ա��
	void deleteMany(int[] ids);
}
