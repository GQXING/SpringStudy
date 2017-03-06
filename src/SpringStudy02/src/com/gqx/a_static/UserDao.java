package com.gqx.a_static;

public class UserDao implements IUserDao {

	@Override
	public void save() {
		System.out.println("********已经保存数据了！**********");
	}

}
