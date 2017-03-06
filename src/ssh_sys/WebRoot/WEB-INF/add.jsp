<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>添加</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  	<s:form action="/emp_save.action" method="post" theme="simple">
  	
  	<table border="1" align="center" cellpadding="5" cellspacing="0">
    	
    		<td>员工姓名</td>
    		<td>
    			<s:textfield name="empName" id="empName"></s:textfield>
    		</td>
    	<tr>
    		<td>员工薪水</td>
    		<td>
    			<s:textfield name="salary" id="salary"></s:textfield>
    		</td>
    	</tr>
    	<tr>
    		<td>选择部门</td>
    		<td>
    			<%-- 传统的HTml标签
    			<select name="">
    				<option value="-1">请选择</option>
    				<option value="1">前端组</option>
    			</select> --%>
    			<!-- name指下拉列表标签
    				 headerKey 		指默认选择项的实际的值
    				 headerValue 	指默认下拉列表项显示的内容
    				 list			下拉列表显示数据的集合 
    				 listKey		集合对象那个字段作为下拉列表实例的值
    				 listValue		集合对象的哪个属性作为下拉列表显示的值
    				 value			设置默认选择项的值 	
    			 -->
    			<s:select name="deptId" list="#request.listDept" listKey="id" listValue="name" headerKey="-1" headerValue="请选择"></s:select>
    		</td>
    	</tr>
    	<tr>
    		<td colspan="2">
				<s:submit value="添加员工"></s:submit>
			</td>
    	</tr>
    </table>
  	
  	</s:form>
    
    
  </body>
</html>