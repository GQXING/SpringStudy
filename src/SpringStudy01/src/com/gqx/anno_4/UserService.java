package com.gqx.anno_4;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service	//ָ��ҵ���߼�������
public class UserService {

	@Resource
	private UserDao userDao;
	
	
	public void save()  {
		userDao.save();
	}
}
