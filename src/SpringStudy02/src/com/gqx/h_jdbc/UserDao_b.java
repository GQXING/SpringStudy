package com.gqx.h_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao_b {
	
	//IOC����ע��
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public void save() throws Exception{
		String sql="insert into t_Dept(deptName) values('ƽ�����')";
		Statement stmt;
		Connection connection=dataSource.getConnection();
		stmt=connection.createStatement();
		stmt.execute(sql);
		stmt.close();
		connection.close();
	}
}
