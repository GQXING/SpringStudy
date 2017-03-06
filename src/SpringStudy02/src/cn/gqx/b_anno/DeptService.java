package cn.gqx.b_anno;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class DeptService {
	//��������ע���dao
	@Resource
	private DeptDao deptDao;

	//�������ע��
	@Transactional(
			readOnly=false,	//��д����
			timeout=-1,		//����ĳ�ʱʱ�䲻����
			//noRollbackFor=ArithmeticException.class	//������ѧ�쳣���ع�
			rollbackFor=ArithmeticException.class,	//ֻ�ع���ѧ�쳣��ָ�����Ӿ�ȷ
			isolation=Isolation.DEFAULT,		//����ĸ��뼶�����ݿ��Ĭ��
			/*
			 * DEFAULT  ʹ�ú�����ݿ�Ĭ�ϵĸ��뼶��(spring�еĵ�ѡ����)
			 * READ_UNCOMMITED �������ȡ��δ�ύ�ĸı��˵����ݡ����ܵ����ࡢ�á������ظ���
			 * READ_COMMITTED �����ڲ��������Ѿ��ύ���ȡ���ɷ�ֹ��������ö��� �����ظ����Կɷ���
			 * REPEATABLE_READ  ����ͬ�ֶεĶ�ζ�ȡ��һ�µģ��������ݱ�������ı䡣�ɷ�ֹ�ࡢ�����ظ��������ö��Կ��ܷ�����
			 * SERIALIZABLE ��ȫ����ACID�ĸ��뼶��ȷ���������ࡢ�á������ظ�����
			 * �������еĸ��뼶�����������ģ����ǵ��͵�ͨ����ȫ�������������漰�����ݱ�����ɵġ�
			 */
			propagation=Propagation.REQUIRES_NEW
			/*Propagation.REQUIRED
			 * ָ��ǰ��������������Ļ�����ִ��
			 * �����ǰ���еķ������Ѿ���������ͻ���뵽��ǰ����
			 * Propagation.REQUIRES_NEW����
			 * ָ��ǰ��������������Ļ�����ִ�У�
			 * �����ǰ���еķ������Ѿ����������������ʼ�տ�ʼһ���µ�����
			 * ִ����󣬸ղŹ��������ż�������
			 * 
			 * �������沿��ǰҪ������־
			 * �����Ƿ񽫲��ű���ɹ�������Ҫд����־�����ʱ��Ҫ��REQUIRES_NEW
			 */
			
	)
		
	public void save(Dept dept){
		//��һ�ε���
		deptDao.save(dept);

		// ģ���쳣,��ʱ����service.save()ִ�гɹ���ʱ��Ҫ�ع�
		int i=1/0;

		//�ڶ��ε���
		deptDao.save(dept);
	}
}
