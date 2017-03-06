package com.gqx.h_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao_a {
	/*
	 * 以下有两个方面需要优化
	 * 一、连接管理
	 * 二、jdbc操作重复代码封装
	 */
	public void save() throws Exception{
		String sql="insert into t_Dept(deptName) values('新媒体')";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection connection=null;
		Statement stmt;
		connection=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DataBaseName=Test", "sa", "123456");
		stmt=connection.createStatement();
		stmt.execute(sql);
		stmt.close();
		connection.close();
	}
}
