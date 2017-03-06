package com.gqx.dao;

import java.util.List;

import com.gqx.entity.Dept;

public interface IDeptDao {
	/**
	 * 查询全部
	 * @return 返回全部信息
	 */
	List<Dept> getAll();
	
	/**
	 * 根据主键查询相关信息
	 * @param id	主键
	 * @return	返回查询后的结果
	 */
	Dept findById(int id);
}
