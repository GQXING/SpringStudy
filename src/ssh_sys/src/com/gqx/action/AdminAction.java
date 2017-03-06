package com.gqx.action;

import com.gqx.entity.Admin;
import com.gqx.service.IAdminService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 管理员模块
 * @author 郭庆兴
 *
 */
public class AdminAction extends ActionSupport implements ModelDriven<Admin> {

	//封装请求数据
	private Admin admin=new Admin();
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public Admin getAdmin() {
		return admin;
	}
	@Override
	public Admin getModel() {
		// TODO Auto-generated method stub
		return admin;
	}

	private IAdminService adminService;
	public void setAdminService(IAdminService adminService) {
		this.adminService = adminService;
	}

	//登入
	public String login(){
		Admin adminInfo=adminService.login(admin);
		System.out.println("我来了");
		//验证
		if (adminInfo==null) {
			return "loginFaild";
		}else {
			ActionContext.getContext().getSession().put("adminInfo", adminInfo);
			return "index";
		}
	}


}
