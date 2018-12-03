package com.internousdev.i1810c.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.i1810c.dao.CartInfoDAO;
import com.internousdev.i1810c.dao.DestinationInfoDAO;
import com.internousdev.i1810c.dao.MCategoryDAO;
import com.internousdev.i1810c.dao.UserInfoDAO;
import com.internousdev.i1810c.dto.DestinationInfoDTO;
import com.internousdev.i1810c.dto.UserInfoDTO;
import com.internousdev.i1810c.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private Map<String,Object>session;
	private String loginId;
	private String password;
	private boolean saveFlg;

	public String execute() throws SQLException{
		String result="logined";
		if (!(session.containsKey("mCategoryDtoList"))) {
			session.put("mCategoryDtoList", (new MCategoryDAO()).getMCategoryList());
		}
		if(!(session.containsKey("logined"))){
			result = ERROR;
			session.remove("loginIdErrorMessageList");
			session.remove("passwordErrorMessageList");
			session.remove("errorMessage");
			List<String>loginIdErrorMessageList=new ArrayList<String>();
			List<String>passwordErrorMessageList=new ArrayList<String>();
			InputChecker ic=new InputChecker();
			loginIdErrorMessageList=ic.doCheck("ログインID",loginId,1,8,true,false,false,true,false,false,false);
			passwordErrorMessageList=ic.doCheck("パスワード",password,1,16,true,false,false,true,false,false,false);
			if(loginIdErrorMessageList.size()!=0){
				session.put("loginIdErrorMessageList", loginIdErrorMessageList);
				session.remove("logined");
			}
			if(passwordErrorMessageList.size()!=0){
				session.put("passwordErrorMessageList", passwordErrorMessageList);
				session.remove("logined");
			}
			UserInfoDAO userInfoDao=new UserInfoDAO();
			if(!(userInfoDao.isExistsUserInfo(loginId, password))){
				if(loginIdErrorMessageList.size()==0 && passwordErrorMessageList.size()==0){
					List<String> errorMessage = new ArrayList<String>();
					errorMessage.add("ログインIDまたは、パスワードに誤りがあります。");
					session.put("errorMessage", errorMessage);
				}
			}else{
				if(userInfoDao.login(loginId, password)>0){
					UserInfoDTO userInfoDto=userInfoDao.getUserInfo(loginId,password);
					session.put("loginId", userInfoDto.getUserId());
					session.put("saveFlg", saveFlg);
					int count=0;
					CartInfoDAO cartInfoDao=new CartInfoDAO();
					count=cartInfoDao.linkToLoginId(String.valueOf(session.get("tempUserId")),loginId);
					if(count>0){
						DestinationInfoDAO destinationInfoDao=new DestinationInfoDAO();
						List<DestinationInfoDTO>destinationInfoDtoList=new ArrayList<DestinationInfoDTO>();
						destinationInfoDtoList=destinationInfoDao.getDestinationInfo(loginId);
						Iterator<DestinationInfoDTO>iterator=destinationInfoDtoList.iterator();
						if(!(iterator.hasNext())){
							destinationInfoDtoList=null;
						}
						session.put("destinationInfoDtoList", destinationInfoDtoList);
					}
					if(session.containsKey("isSettlement")){
						result="settlement";
					}else{
						result=SUCCESS;
					}
					session.put("logined", "logined");
				}
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

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isSaveFlg() {
		return saveFlg;
	}

	public void setSaveFlg(boolean saveFlg) {
		this.saveFlg = saveFlg;
	}
}
