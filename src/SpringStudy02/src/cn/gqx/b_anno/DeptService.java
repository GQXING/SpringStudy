package cn.gqx.b_anno;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class DeptService {
	//接受容器注入的dao
	@Resource
	private DeptDao deptDao;

	//事物控制注解
	@Transactional(
			readOnly=false,	//读写事物
			timeout=-1,		//事物的超时时间不限制
			//noRollbackFor=ArithmeticException.class	//遇到数学异常不回滚
			rollbackFor=ArithmeticException.class,	//只回滚数学异常，指定更加精确
			isolation=Isolation.DEFAULT,		//事物的隔离级别，数据库的默认
			/*
			 * DEFAULT  使用后端数据库默认的隔离级别(spring中的的选择项)
			 * READ_UNCOMMITED 允许你读取还未提交的改变了的数据。可能导致脏、幻、不可重复读
			 * READ_COMMITTED 允许在并发事务已经提交后读取。可防止脏读，但幻读和 不可重复读仍可发生
			 * REPEATABLE_READ  对相同字段的多次读取是一致的，除非数据被事务本身改变。可防止脏、不可重复读，但幻读仍可能发生。
			 * SERIALIZABLE 完全服从ACID的隔离级别，确保不发生脏、幻、不可重复读。
			 * 这在所有的隔离级别中是最慢的，它是典型的通过完全锁定在事务中涉及的数据表来完成的。
			 */
			propagation=Propagation.REQUIRES_NEW
			/*Propagation.REQUIRED
			 * 指当前方法必须在事物的环境下执行
			 * 如果当前运行的方法，已经存在事物，就会加入到当前事物
			 * Propagation.REQUIRES_NEW类似
			 * 指当前方法必须在事物的环境下执行；
			 * 如果当前运行的方法，已经存在事物，事物会挂起，始终开始一个新的事物
			 * 执行完后，刚才挂起的事物才继续运行
			 * 
			 * 举例保存部门前要插入日志
			 * 不管是否将部门保存成功，都需要写入日志，这个时候要用REQUIRES_NEW
			 */
			
	)
		
	public void save(Dept dept){
		//第一次调用
		deptDao.save(dept);

		// 模拟异常,此时整个service.save()执行成功的时候要回滚
		int i=1/0;

		//第二次调用
		deptDao.save(dept);
	}
}
