package com.gqx.b_dynamic;

public class UserDao implements IUserDao {

	@Override
	public int save() {
		System.out.println("已经保存数据了！");
		return 1;
	}

}
