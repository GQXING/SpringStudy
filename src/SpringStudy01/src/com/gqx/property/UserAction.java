package com.gqx.property;

public class UserAction {
	//UserService:springIOC����ע��
	private UserService service;
	public void setService(UserService service) {
		this.service = service;
	}
	public UserService getService() {
		return service;
	}
	public String execute(){
		service.save();
		return null;
	}
}
