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
	
	/*****һ����װ����***********/
	private Employee employee=new Employee();
	//��װ����Ĳ��ŵ�id
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
		return employee;	//����ʵ����Ķ���
	}
	/*****����ע��service**********/
	private IEmployeeService employeeService;
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	private IDeptService deptService;
	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}
	
	//1��Ա���б�չʾ
	public String list() throws Exception {
		// TODO Auto-generated method stub
		List<Employee> listEmp=employeeService.getAll();
		//���浽request
		Map<String, Object> request=(Map<String, Object>) ActionContext.getContext().get("request");
		request.put("listEmp", listEmp);
		return "list";
	}
	
	//2�����Ա�� - �������ҳ��viewAdd
	public String viewAdd(){
		// ��ѯ���в�����Ϣ ���浽request
		List<Dept> listDept=deptService.getAll();
		request.put("listDept", listDept);
		return "add";
	}
	
	//���Ա�� - ���Ա������
	public String save(){
		//�ȸ��ݲ��������ѯ
		Dept dept=deptService.findById(deptId);
		employee.setDept(dept);
		employeeService.save(employee);
		return "listAction";	//��ֹ����ύ��Ӧ���ض���Action
	}
	
	//3���޸�Ա����Ϣ�������޸���ͼ
	public String viewUpdate(){
		int id=employee.getId();		//ģ��������ֱ�ӿ���ͨ�������ȡid�������Ѿ��Զ���װ����
		Employee employee=employeeService.findById(id);
		//��ѯ����
		List<Dept> listDept=deptService.getAll();
		
		//���ݻ���
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.pop();	//�Ƴ�ջ��Ԫ��
		vs.push(employee);	
		
		request.put("listDept", listDept);
		return "edit";
	}
	
	//ȷ���޸�Ա����Ϣ
	public String update(){
		//�ָ��ݲ���id��ѯ���Ŷ���
		Dept dept=deptService.findById(deptId);
		//���õ�Ա��������\
		employee.setDept(dept);
		//����Ա��
		employeeService.update(employee);
		return "listAction";
	}
	
	//4��ɾ��Ա��
	public String delete(){
		int empId=employee.getId();
		employeeService.delete(empId);
		return "listAction";
	}

	//���ܿ������ʱ�����request�����map
	private Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request=request;
	}

	
}
