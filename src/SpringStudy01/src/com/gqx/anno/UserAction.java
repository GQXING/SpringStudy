package com.gqx.anno;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("userAction")	//º”»ÎIOC»›∆˜
public class UserAction {
	@Resource(name="service")
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
