package cn.gqx.a_tx;

public class DeptService {
	//接受容器注入的dao
	private DeptDao deptDao;
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	
	public void save(Dept dept){
		//第一次调用
		deptDao.save(dept);
		
		// 模拟异常,此时整个service.save()执行成功的时候要回滚
		int i=1/0;
		
		//第二次调用
		deptDao.save(dept);
	}
}
