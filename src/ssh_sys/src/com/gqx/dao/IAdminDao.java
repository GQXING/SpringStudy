package com.gqx.dao;

import com.gqx.entity.Admin;

/**
 * ����Աdaoģ��
 * @author ������
 *
 */
public interface IAdminDao {
	/**
	 * ����
	 * @param admin ����Ա����
	 */
	void save(Admin admin);
	/**
	 * ���ݹ���Ա��Ϣ��ѯ
	 * @param admin
	 * @return ���ز�ѯ��Ľ��
	 */
	Admin findByaAdmin(Admin admin);
}
