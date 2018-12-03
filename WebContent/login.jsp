<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<%
//ブラウザのキャッシュを無効にする。
// Last-Modified(最終更新日) : 本日
// Expires(有効期限)         : 過去日(1970/01/01)
// pragma no-cache           : HTTP1.0仕様に基づく「キャッシュ無効指示」
// Cache-Control no-cache    : HTTP1.1仕様に基づく「キャッシュ無効指示」
java.util.Calendar objCal1=java.util.Calendar.getInstance();
java.util.Calendar objCal2=java.util.Calendar.getInstance();
objCal2.set(1970,0,1,0,0,0);
response.setDateHeader("Last-Modified",objCal1.getTime().getTime());
response.setDateHeader("Expires",objCal2.getTime().getTime());
response.setHeader("progma","no-cache");
response.setHeader("Cache-Control","no-cache");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />

<link rel="stylesheet" type="text/css" href="./css/i1810c.css">
<link rel="stylesheet" type="text/css" href="./css/form.css">
<link rel="stylesheet" type="text/css" href="./css/login.css">
<title>ログイン画面</title>
<body>
<s:include value="header.jsp"/>
<div id="contents">
	<h1>ログイン画面</h1>

	<div class="error">
	<s:if test="!#session.loginIdErrorMessageList.isEmpty()">
			<div class="error-message">
				<s:iterator value="#session.loginIdErrorMessageList"><s:property /><br></s:iterator>
			</div>
		</s:if>
			<s:if test="!#session.passwordErrorMessageList.isEmpty()">
			<div class="error-message">
				<s:iterator value="#session.passwordErrorMessageList"><s:property /><br></s:iterator>
			</div>
			</s:if>
			<s:if test="!#session.errorMessage.isEmpty()">
			<div class="error-message">
				<s:iterator value="#session.errorMessage"><s:property /><br></s:iterator>
			</div>
			</s:if>
	</div>
	<div id="create-box">
		<s:form action="LoginAction">
			<span class="form-heading">ログインID</span>
			<s:if test="#session.saveFlg==true">
				<s:textfield name="loginId" tabindex="1" value="%{#session.savedLoginId}" class="form-txt"/>
			</s:if>
			<s:else>
				<s:textfield name="loginId" tabindex="1" class="form-txt"/>
			</s:else>
			<span class="form-heading">パスワード</span>
			<span id="resetpass-link">
				<a href="ResetPasswordAction">パスワード再設定</a>
			</span>
			<s:password name="password" tabindex="2" class="form-txt" autocomplete="new-password"/>
			<div class="form-check">
				<s:if test="#session.saveFlg==true">
					<s:checkbox name="saveFlg"  checked="checked" />
				</s:if>
				<s:else>
					<s:checkbox name="saveFlg" />
				</s:else>
				<s:label value="ログインID保存"/><br>
			</div>
			<s:submit value="ログイン" tabindex="3" class="form-submit"/>
		</s:form>
	</div>
	<br>
	<div id="createuser-btn">
		<a href="CreateUserAction">アカウントの新規登録</a>
	</div>
</div>
<s:include value="footer.jsp"/>
</body>
</html>