package com.gqx.dao;

import java.util.List;

import com.gqx.entity.Employee;

/**
 * 所有dao的通用操作接口定义
 * @author 郭庆兴
 *
 */
public interface IBaseDao<T> {
	void save(T employee);

	void update(T employee);

	void delete(int id);

	T findById(int id);

	List<T> getAll();

}
