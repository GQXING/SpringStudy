package com.gqx.h_jdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UserDao_c {

	//IOC容器注入
//	private DataSource dataSource;
//	public void setDataSource(DataSource dataSource) {
//		this.dataSource = dataSource;
//	}
	//使用jdbc模板工具类简化jdbc操作
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void save() throws Exception{
		String sql="insert into t_Dept(deptName) values('安卓组')";
		jdbcTemplate.update(sql);
	}

	public Dept findById(int id) throws Exception{
		String sql="select * from t_Dept where deptId=?";
		List<Dept> list=jdbcTemplate.query(sql, new MyResult(),id);
		System.out.println(list);
		return (list!=null && list.size()>0) ? list.get(0):null;
	}

	public List<Dept> findAll() throws Exception{
		String sql="select * from t_Dept";
		List<Dept> list=jdbcTemplate.query(sql, new MyResult());
		System.out.println(list);
		return list;
	}

	//内部类
	class MyResult implements RowMapper<Dept>{
		//封装一行记录
		@Override
		public Dept mapRow(ResultSet rs, int index) throws SQLException {
			Dept dept=new Dept();
			dept.setDeptId(rs.getInt("deptId"));
			dept.setDeptName(rs.getString("deptName"));
			return dept;
		}
	}
}
