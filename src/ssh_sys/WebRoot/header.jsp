<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<div align="center" style="width:80%">
	<!-- 判断用户是否登入 -->
	<s:if test="#session.adminInfo != null">
	欢迎您，<s:property value="#session.adminInfo.adminName" />&nbsp;
	<s:a href="emp_viewAdd">添加员工</s:a>&nbsp;
	<s:a href="#">退出</s:a>
	</s:if>
	<s:else>
		<s:a href="login.jsp">登入</s:a>
		<s:a href="register,jsp">注册</s:a>
	</s:else>
</div>