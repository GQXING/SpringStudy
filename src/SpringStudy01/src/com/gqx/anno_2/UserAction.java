package com.gqx.anno_2;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class UserAction {
	@Resource
	private UserService service;
	
	public String execute(){
		service.save();
		return null;
	}
}
