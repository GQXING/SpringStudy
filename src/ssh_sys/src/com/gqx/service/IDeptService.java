package com.gqx.service;

import java.util.List;

import com.gqx.entity.Dept;

public interface IDeptService {
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
