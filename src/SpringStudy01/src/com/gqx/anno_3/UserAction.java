package com.gqx.anno_3;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller	//���Ʋ�����
public class UserAction {
	@Resource
	private UserService userService;
	
	public String execute(){
		userService.save();
		return null;
	}
}
