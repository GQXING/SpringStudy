package com.gqx.anno_3;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller	//控制层的组件
public class UserAction {
	@Resource
	private UserService userService;
	
	public String execute(){
		userService.save();
		return null;
	}
}
