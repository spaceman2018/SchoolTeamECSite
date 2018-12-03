package com.internousdev.i1810c.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.i1810c.dao.MCategoryDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordAction extends ActionSupport implements SessionAware{
	private Map<String,Object>session;

	public String execute(){
		String result= ERROR;
		if (!(session.containsKey("mCategoryDtoList"))) {
			session.put("mCategoryDtoList", (new MCategoryDAO()).getMCategoryList());
		}
		if(!(session.containsKey("logined"))) {
			session.remove("loginIdErrorMessageList");
			session.remove("passwordErrorMessageList");
			session.remove("newPasswordErrorMessageList");
			session.remove("reConfirmationNewPasswordErrorMessageList");
			session.remove("newPasswordIncorrectErrorMessageList");
			result = SUCCESS;
		}
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
