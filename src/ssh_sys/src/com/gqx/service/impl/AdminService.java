package com.gqx.service.impl;

import com.gqx.dao.IAdminDao;
import com.gqx.entity.Admin;
import com.gqx.service.IAdminService;

public class AdminService implements IAdminService {
	
	//注入dao
	/**
	 * 实现接口采用jdk代理，会生成$proxy....的类，与adminDao不符，
	 * 这里只能用接口
	 */
	private IAdminDao adminDao;
	public void setAdminDao(IAdminDao adminDao) {
		this.adminDao = adminDao;
	}
	
	@Override
	public void register(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.save(admin);
	}

	@Override
	public Admin login(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.findByaAdmin(admin);
	}

}
