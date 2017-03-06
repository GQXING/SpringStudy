package com.gqx.action;

import java.util.Map;

import com.gqx.entity.Employee;
import com.gqx.service.EmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport{
	//IOC×¢Èë
	private EmployeeService employeeService;
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@Override
	public String execute() throws Exception {
		int empId=3;
		Employee employee=employeeService.findById(empId);
		Map<String, Object> request=(Map<String, Object>) ActionContext.getContext().get("request");
		request.put("employee", employee);
		return SUCCESS;
	}

}
