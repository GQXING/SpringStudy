package cn.gqx.b_anno;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * dao实现，使用spring对jdbc支持
 * @author 郭庆兴
 *
 */
@Repository
public class DeptDao {
	//在日期中注入JdbcTemplate对象\
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	public void save(Dept dept){
		String sql="insert into t_Dept(deptName) values(?)";
		jdbcTemplate.update(sql,dept.getDeptName());
	}
}
