<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'login.jsp' starting page</title>
</head>

<body>
	<s:form action="/admin_login.action" method="post" theme="simple">
		<table border="1" align="center" cellpadding="5" cellspacing="0">
			<tr>
				<td>管理员姓名:</td>
				<td>
					<s:textfield name="adminName" id="adminName"></s:textfield>
				</td>
			</tr>
			<tr>
				<td>密码</td>
				<td>
					<s:textfield name="password" id="password"></s:textfield>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<s:submit value="登入"></s:submit>
				</td>
			</tr>
		</table>
	</s:form>
</body>
</html>
