package com.gqx.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.SessionFactory;

import com.gqx.dao.IBaseDao;
import com.gqx.entity.Employee;
/**
 * 所有Dao的通用操作，所有的Dao都继承此类
 * @author 郭庆兴
 *
 * @param <T>
 */
public class BaseDao<T> implements IBaseDao<T> {
	//当前操作的实际的bean类型
	private Class<T> clazz;
	//获取类的名称
	private String className;
	//构造函数反射泛型
	public BaseDao(){
		//获取当前运行类的父类的参数化类型（如EmployeeDao的BaseDao<Employee>）
		Type type=this.getClass().getGenericSuperclass();
		ParameterizedType pt=(ParameterizedType) type;
		//得到实际类型
		Type types[]=pt.getActualTypeArguments();
		//获取实际类型
		clazz=(Class<T>) types[0];
		
		className=clazz.getSimpleName();	//如得到Emlpoyee
	}
	//IOC容器注入sessionFactory对象
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void save(T t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(t);
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(t);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("delete from "+className+" where id=?")
		.setParameter(0, id).executeUpdate();
	}

	@Override
	public T findById(int id) {
		// TODO Auto-generated method stub
		return (T) sessionFactory.getCurrentSession().get(clazz, id);
	}

	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from "+className).list();
	}

}
