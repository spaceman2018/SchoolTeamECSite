package com.internousdev.i1810c.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.i1810c.dao.MCategoryDAO;
import com.internousdev.i1810c.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserCompleteAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;

	public String execute() {
		String result = ERROR;
		if (!(session.containsKey("mCategoryDtoList"))) {
			session.put("mCategoryDtoList", (new MCategoryDAO()).getMCategoryList());
		}
		if (!(session.containsKey("logined"))) {
			UserInfoDAO userInfoDAO = new UserInfoDAO();
			int count = userInfoDAO.createUser(String.valueOf(session.get("familyName")),
					String.valueOf(session.get("firstName")), String.valueOf(session.get("familyNameKana")),
					String.valueOf(session.get("firstNameKana")), String.valueOf(session.get("sex")),
					String.valueOf(session.get("email")), String.valueOf(session.get("loginId")),
					String.valueOf(session.get("password")));
			if (count > 0) {
				session.put("reserve", String.valueOf(session.get("loginId")));
				result = SUCCESS;
			}
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
