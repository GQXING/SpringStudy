package com.gqx.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.gqx.entity.Dept;
import com.gqx.entity.Employee;
import com.gqx.service.IDeptService;
import com.gqx.service.IEmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class EmployeeAction extends ActionSupport implements RequestAware,ModelDriven<Employee>{
	
	/*****一、封装数据***********/
	private Employee employee=new Employee();
	//封装请求的部门的id
	private int deptId;
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Employee getEmployee() {
		return employee;	
	}
	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		return employee;	//返回实例后的对象
	}
	/*****二、注入service**********/
	private IEmployeeService employeeService;
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	private IDeptService deptService;
	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}
	
	//1、员工列表展示
	public String list() throws Exception {
		// TODO Auto-generated method stub
		List<Employee> listEmp=employeeService.getAll();
		//保存到request
		Map<String, Object> request=(Map<String, Object>) ActionContext.getContext().get("request");
		request.put("listEmp", listEmp);
		return "list";
	}
	
	//2、添加员工 - 进入添加页面viewAdd
	public String viewAdd(){
		// 查询所有部门信息 保存到request
		List<Dept> listDept=deptService.getAll();
		request.put("listDept", listDept);
		return "add";
	}
	
	//添加员工 - 添加员工数据
	public String save(){
		//先根据部门组件查询
		Dept dept=deptService.findById(deptId);
		employee.setDept(dept);
		employeeService.save(employee);
		return "listAction";	//防止多次提交，应该重定向到Action
	}
	
	//3、修改员工信息，加入修改视图
	public String viewUpdate(){
		int id=employee.getId();		//模型驱动，直接可以通过这个获取id，数据已经自动封装好了
		Employee employee=employeeService.findById(id);
		//查询部门
		List<Dept> listDept=deptService.getAll();
		
		//数据回显
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.pop();	//移除栈顶元素
		vs.push(employee);	
		
		request.put("listDept", listDept);
		return "edit";
	}
	
	//确定修改员工信息
	public String update(){
		//现根据部门id查询部门对象
		Dept dept=deptService.findById(deptId);
		//设置到员工属性中\
		employee.setDept(dept);
		//更新员工
		employeeService.update(employee);
		return "listAction";
	}
	
	//4、删除员工
	public String delete(){
		int empId=employee.getId();
		employeeService.delete(empId);
		return "listAction";
	}

	//接受框架运行时候传入的request对象的map
	private Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request=request;
	}

	
}
