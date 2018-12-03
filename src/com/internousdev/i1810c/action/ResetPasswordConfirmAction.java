package com.internousdev.i1810c.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.i1810c.dao.MCategoryDAO;
import com.internousdev.i1810c.dao.UserInfoDAO;
import com.internousdev.i1810c.util.CommonUtility;
import com.internousdev.i1810c.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordConfirmAction extends ActionSupport implements SessionAware{
	private Map<String,Object>session;
	private String newLoginId;
	private String password;
	private String newPassword;
	private String reConfirmationPassword;

	public String execute(){
		String result=ERROR;
		if (!(session.containsKey("mCategoryDtoList"))) {
			session.put("mCategoryDtoList", (new MCategoryDAO()).getMCategoryList());
		}
		if(!(session.containsKey("logined"))){
			List<String>loginIdEMList =new ArrayList<String>();
			List<String>passwordEMList =new ArrayList<String>();
			List<String>passwordIncorrectEMList=new ArrayList<String>();
			List<String>newPasswordEMList=new ArrayList<String>();
			List<String>reConfirmationNewPasswordEMList=new ArrayList<String>();
			List<String>newPasswordIncorrectEMList=new ArrayList<String>();
			session.remove("loginIdErrorMessageList");
			session.remove("passwordErrorMessageList");
			session.remove("passwordIncorrectErrorMessageList");
			session.remove("newPasswordErrorMessageList");
			session.remove("reConfirmationNewPasswordErrorMessageList");
			session.remove("newPasswordIncorrectErrorMessageList");
			InputChecker ic=new InputChecker();
			loginIdEMList=ic.doCheck("ログインID", newLoginId, 1, 8, true, false, false, true, false, false, false);
			passwordEMList=ic.doCheck("現在のパスワード", password, 1, 16, true, false, false, true, false, false, false);
			newPasswordEMList=ic.doCheck("新しいパスワード",newPassword , 1, 16, true, false, false, true, false, false, false);
			reConfirmationNewPasswordEMList=ic.doCheck("新しいパスワード（再確認）", reConfirmationPassword, 1, 16, true, false, false, true, false, false, false);
			if(loginIdEMList.size()!=0 || passwordEMList.size()!=0 || newPasswordEMList.size()!=0 || reConfirmationNewPasswordEMList.size()!=0){
				session.put("loginIdErrorMessageList", loginIdEMList);
				session.put("passwordErrorMessageList", passwordEMList);
				session.put("newPasswordErrorMessageList", newPasswordEMList);
				session.put("reConfirmationNewPasswordErrorMessageList", reConfirmationNewPasswordEMList);
			}else{
				newPasswordIncorrectEMList=ic.doPasswordCheck(newPassword,reConfirmationPassword);
				if(newPasswordIncorrectEMList.size()!=0){
					session.put("newPasswordIncorrectErrorMessageList", newPasswordIncorrectEMList);
				}else{
					UserInfoDAO userInfoDao=new UserInfoDAO();
					if(userInfoDao.isExistsUserInfo(newLoginId, password)){
						String concealPassword=(new CommonUtility()).concealPassword(newPassword);
						session.put("newPassword", newPassword);
						session.put("newLoginId", newLoginId);
						session.put("concealPassword", concealPassword);
						result=SUCCESS;
					}else{
						passwordIncorrectEMList.add("入力されたパスワードが異なります。");
						session.put("passwordIncorrectErrorMessageList", passwordIncorrectEMList);
					}
				}
			}
		}
		return result;
	}

	public Map<String,Object> getSession() {
	    return session;
	}
	public void setSession(Map<String,Object> session) {
	    this.session = session;
	}

	public String getNewLoginId() {
		return newLoginId;
	}

	public void setNewLoginId(String newLoginId) {
		this.newLoginId = newLoginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getReConfirmationPassword() {
		return reConfirmationPassword;
	}

	public void setReConfirmationPassword(String reConfirmationPassword) {
		this.reConfirmationPassword = reConfirmationPassword;
	}
}
