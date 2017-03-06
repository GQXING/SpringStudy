package com.gqx.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
/**
 * У���û��Ƿ���룬ֻ�е����ſ��Խ��в���
 * û�е���ֻ�ܲ鿴�б����ܲ���
 * @author ������
 *
 */
public class UserInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//�õ���ǰִ�еķ���
		String methodName=invocation.getProxy().getMethod();
		//�õ�ActionContext
		ActionContext ac=invocation.getInvocationContext();
		//��ȡ����session��map,��session�л�ȡ����Ĺ���Ա�˺�
		Object object=ac.getSession().get("adminInfo");
		if (!"login".equals(methodName) &&  !"list".equals(methodName)) {
			if (object == null) {
				return "login";
			}else {
				return invocation.invoke();
			}
		}else {
			//���з��ʵ�����б�չʾ���ⲻ��Ҫ����
			return invocation.invoke();
		}
	}

}
