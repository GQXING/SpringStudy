package cn.gqx.a_tx;

public class DeptService {
	//��������ע���dao
	private DeptDao deptDao;
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	
	public void save(Dept dept){
		//��һ�ε���
		deptDao.save(dept);
		
		// ģ���쳣,��ʱ����service.save()ִ�гɹ���ʱ��Ҫ�ع�
		int i=1/0;
		
		//�ڶ��ε���
		deptDao.save(dept);
	}
}
