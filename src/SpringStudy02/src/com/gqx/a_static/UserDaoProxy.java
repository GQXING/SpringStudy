package com.gqx.a_static;
/**
 * ��̬�����������
 * @author ������
 *
 */
public class UserDaoProxy implements IUserDao{
	//���ܱ���Ŀ�����
	private IUserDao target;
	public UserDaoProxy(IUserDao target){
		this.target=target;
	}
	@Override
	public void save() {	//����ԭ��
		System.out.println("��ʼ���������������");
		target.save();	//ִ��Ŀ�����ķ���
		System.out.println("�ύ���������������");
	}
	
}
