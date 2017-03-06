package com.gqx.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
/**
 * 校验用户是否登入，只有登入后才可以进行操作
 * 没有登入只能查看列表，不能操作
 * @author 郭庆兴
 *
 */
public class UserInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//得到当前执行的方法
		String methodName=invocation.getProxy().getMethod();
		//得到ActionContext
		ActionContext ac=invocation.getInvocationContext();
		//获取代表session的map,从session中获取登入的管理员账号
		Object object=ac.getSession().get("adminInfo");
		if (!"login".equals(methodName) &&  !"list".equals(methodName)) {
			if (object == null) {
				return "login";
			}else {
				return invocation.invoke();
			}
		}else {
			//运行访问登入和列表展示，这不需要登入
			return invocation.invoke();
		}
	}

}
