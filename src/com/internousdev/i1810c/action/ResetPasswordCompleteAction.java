package com.internousdev.i1810c.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.i1810c.dao.MCategoryDAO;
import com.internousdev.i1810c.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordCompleteAction extends ActionSupport implements SessionAware{
	private Map<String,Object>session;

	public String execute(){
		String result=ERROR;
		if (!(session.containsKey("mCategoryDtoList"))) {
			session.put("mCategoryDtoList", (new MCategoryDAO()).getMCategoryList());
		}
		if(!(session.containsKey("logined"))){
			UserInfoDAO userInfoDao=new UserInfoDAO();
			int count = userInfoDao.resetPassword(String.valueOf(session.get("newLoginId")), String.valueOf(session.get("newPassword")));
			if(count>0){
				session.remove("newLoginId");
				result=SUCCESS;
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
