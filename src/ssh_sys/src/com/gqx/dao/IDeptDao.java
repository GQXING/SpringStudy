package com.gqx.dao;

import java.util.List;

import com.gqx.entity.Dept;

public interface IDeptDao {
	/**
	 * ��ѯȫ��
	 * @return ����ȫ����Ϣ
	 */
	List<Dept> getAll();
	
	/**
	 * ����������ѯ�����Ϣ
	 * @param id	����
	 * @return	���ز�ѯ��Ľ��
	 */
	Dept findById(int id);
}
