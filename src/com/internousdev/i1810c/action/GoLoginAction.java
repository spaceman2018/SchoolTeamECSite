package com.internousdev.i1810c.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.i1810c.dao.MCategoryDAO;
import com.opensymphony.xwork2.ActionSupport;

public class GoLoginAction extends ActionSupport implements SessionAware{
	private Map<String,Object>session;

	public String execute(){
		if (!(session.containsKey("mCategoryDtoList"))) {
			session.put("mCategoryDtoList", (new MCategoryDAO()).getMCategoryList());
		}
		session.remove("reserve");
		session.remove("isSettlement");
		String result = ERROR;
		session.remove("loginIdErrorMessageList");
		session.remove("passwordErrorMessageList");
		session.remove("errorMessage");
		session.put("loginIdErrorMessageList", "");
		session.put("passwordErrorMessageList", "");
		if(!(session.containsKey("logined"))) {
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
