package com.gqx.service.impl;

import java.util.List;

import com.gqx.dao.IDeptDao;
import com.gqx.entity.Dept;
import com.gqx.service.IDeptService;

public class DeptService implements IDeptService {

	private IDeptDao deptDao;
	public void setDeptDao(IDeptDao deptDao) {
		this.deptDao = deptDao;
	}
	
	@Override
	public List<Dept> getAll() {
		// TODO Auto-generated method stub
		return deptDao.getAll();
	}

	@Override
	public Dept findById(int id) {
		// TODO Auto-generated method stub
		return deptDao.findById(id);
	}

}
