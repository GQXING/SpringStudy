package com.gqx.h_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao_b {
	
	//IOC容器注入
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public void save() throws Exception{
		String sql="insert into t_Dept(deptName) values('平面设计')";
		Statement stmt;
		Connection connection=dataSource.getConnection();
		stmt=connection.createStatement();
		stmt.execute(sql);
		stmt.close();
		connection.close();
	}
}
