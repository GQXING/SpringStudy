package com.gqx.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.SessionFactory;

import com.gqx.dao.IBaseDao;
import com.gqx.entity.Employee;
/**
 * ����Dao��ͨ�ò��������е�Dao���̳д���
 * @author ������
 *
 * @param <T>
 */
public class BaseDao<T> implements IBaseDao<T> {
	//��ǰ������ʵ�ʵ�bean����
	private Class<T> clazz;
	//��ȡ�������
	private String className;
	//���캯�����䷺��
	public BaseDao(){
		//��ȡ��ǰ������ĸ���Ĳ��������ͣ���EmployeeDao��BaseDao<Employee>��
		Type type=this.getClass().getGenericSuperclass();
		ParameterizedType pt=(ParameterizedType) type;
		//�õ�ʵ������
		Type types[]=pt.getActualTypeArguments();
		//��ȡʵ������
		clazz=(Class<T>) types[0];
		
		className=clazz.getSimpleName();	//��õ�Emlpoyee
	}
	//IOC����ע��sessionFactory����
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
