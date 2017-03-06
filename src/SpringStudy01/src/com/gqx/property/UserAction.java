package com.gqx.property;

public class UserAction {
	//UserService:springIOCÈÝÆ÷×¢Èë
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
