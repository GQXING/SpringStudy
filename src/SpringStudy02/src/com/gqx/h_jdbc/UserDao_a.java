package com.gqx.h_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao_a {
	/*
	 * ����������������Ҫ�Ż�
	 * һ�����ӹ���
	 * ����jdbc�����ظ������װ
	 */
	public void save() throws Exception{
		String sql="insert into t_Dept(deptName) values('��ý��')";
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
