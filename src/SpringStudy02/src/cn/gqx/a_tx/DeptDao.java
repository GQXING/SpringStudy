package cn.gqx.a_tx;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * dao实现，使用spring对jdbc支持
 * @author 郭庆兴
 *
 */
public class DeptDao {
	//在日期中注入JdbcTemplate对象
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void save(Dept dept){
		String sql="insert into t_Dept(deptName) values(?)";
		jdbcTemplate.update(sql,dept.getDeptName());
	}
}
