package com.gqx.dao;

import com.gqx.entity.Admin;

/**
 * 管理员dao模块
 * @author 郭庆兴
 *
 */
public interface IAdminDao {
	/**
	 * 保存
	 * @param admin 管理员对象
	 */
	void save(Admin admin);
	/**
	 * 根据管理员信息查询
	 * @param admin
	 * @return 返回查询后的结果
	 */
	Admin findByaAdmin(Admin admin);
}
