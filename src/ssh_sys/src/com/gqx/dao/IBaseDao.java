package com.gqx.dao;

import java.util.List;

import com.gqx.entity.Employee;

/**
 * ����dao��ͨ�ò����ӿڶ���
 * @author ������
 *
 */
public interface IBaseDao<T> {
	void save(T employee);

	void update(T employee);

	void delete(int id);

	T findById(int id);

	List<T> getAll();

}
