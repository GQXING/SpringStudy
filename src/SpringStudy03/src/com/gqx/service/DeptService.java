package com.gqx.service;

import com.gqx.dao.DeptDao;
import com.gqx.entity.Dept;

public class DeptService {
	private DeptDao deptDao;
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	
	public void save(Dept dept){
		deptDao.save(dept);
	}
}
