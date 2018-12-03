package com.internousdev.i1810c.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.i1810c.dao.MCategoryDAO;
import com.internousdev.i1810c.dao.UserInfoDAO;
import com.internousdev.i1810c.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserConfirmAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private int sex;
	private String sexWord;
	private String email;
	private String loginId;
	private String password;
	private List<String> sexList = new ArrayList<String>();

	public String execute(){
		session.put("familyName", familyName);
		session.put("firstName", firstName);
		session.put("familyNameKana", familyNameKana);
		session.put("firstNameKana", firstNameKana);
		session.put("sex", sex);
		session.put("email", email);
		session.put("loginId", loginId);
		session.put("password", password);
		
		String result = ERROR;

		session.remove("familyNameErrorMessageList");
		session.remove("firstNameErrorMessageList");
		session.remove("familyNameKanaErrorMessageList");
		session.remove("firstNameKanaErrorMessageList");
		session.remove("emailErrorMessageList");
		session.remove("loginIdErrorMessageList");
		session.remove("loginIdDuplicationErrorMessageList");
		session.remove("passwordErrorMessageList");

		if (!(session.containsKey("mCategoryDtoList"))) {
			session.put("mCategoryDtoList", (new MCategoryDAO()).getMCategoryList());
		}
		if(!(session.containsKey("logined"))){

			List<String> familyNameErrorMessageList = new ArrayList<String>();
			List<String> firstNameErrorMessageList = new ArrayList<String>();
			List<String> familyNameKanaErrorMessageList=new ArrayList<String>();
			List<String> firstNameKanaErrorMessageList= new ArrayList<String>();
			List<String> emailErrorMessageList= new ArrayList<String>();
			List<String> loginIdErrorMessageList=new ArrayList<String>();
			List<String> loginIdDuplicationErrorMessageList=new ArrayList<String>();
			List<String> passwordErrorMessageList=new ArrayList<String>();
			if(sex == 0){
				sexWord ="男性";
			}else if(sex == 1){
				sexWord = "女性";
			}
			InputChecker inputChecker = new InputChecker();
			familyNameErrorMessageList = inputChecker.doCheck("姓",familyName,1,16,true,true,true,false,false,false,false);
			firstNameErrorMessageList = inputChecker.doCheck("名",firstName,1,16,true,true,true,false,false,false,false);
			familyNameKanaErrorMessageList = inputChecker.doCheck("姓ふりがな",familyNameKana,1,16,false,false,true,false,false,false,false);
			firstNameKanaErrorMessageList = inputChecker.doCheck("名ふりがな",firstNameKana,1,16,false,false,true,false,false,false,false);
			emailErrorMessageList = inputChecker.doCheck("メールアドレス",email,14,32,true,false,false,true,true,false,false);
			loginIdErrorMessageList = inputChecker.doCheck("ログインID",loginId,1,8,true,false,false,true,false,false,false);
			passwordErrorMessageList = inputChecker.doCheck("パスワード",password,1,16,true,false,false,true,false,false,false);

			if(familyNameErrorMessageList.size()==0
					&& firstNameErrorMessageList.size()==0
					&& familyNameKanaErrorMessageList.size()==0
					&& firstNameKanaErrorMessageList.size()==0
					&& emailErrorMessageList.size()==0
					&& loginIdErrorMessageList.size()==0
					&& passwordErrorMessageList.size()==0){
				if ((new UserInfoDAO()).isExistsLoginId(loginId) > 0) {
					loginIdDuplicationErrorMessageList.add("すでにそのログインIDは存在します。");
					session.put("loginIdDuplicationErrorMessageList", loginIdDuplicationErrorMessageList);
				}else{
				result = SUCCESS;
				}
			}else{
				session.put("familyNameErrorMessageList", familyNameErrorMessageList);
				session.put("firstNameErrorMessageList", firstNameErrorMessageList);
				session.put("familyNameKanaErrorMessageList", familyNameKanaErrorMessageList);
				session.put("firstNameKanaErrorMessageList", firstNameKanaErrorMessageList);
				session.put("emailErrorMessageList", emailErrorMessageList);
				session.put("loginIdErrorMessageList", loginIdErrorMessageList);
				session.put("passwordErrorMessageList", passwordErrorMessageList);
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

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getSexWord() {
		return sexWord;
	}

	public void setSexWord(String sexWord) {
		this.sexWord = sexWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public List<String> getSexList() {
		return sexList;
	}

	public void setSexList(List<String> sexList) {
		this.sexList = sexList;
	}
}
