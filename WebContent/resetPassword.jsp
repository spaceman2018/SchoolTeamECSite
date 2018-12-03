<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/i1810c.css">
<link rel="stylesheet" type="text/css" href="./css/resetPassword.css">
<title>パスワード再設定</title>
</head>
<body>
<s:include value="header.jsp"/>
<div id="contents">
	<div id="outbox1">
		<div class="title"><h1>パスワード再設定</h1></div>
		<div class="error">
			<div class="error-message">
				<s:if test="!#session.loginIdErrorMessageList.isEmpty()">
					<s:iterator value="#session.loginIdErrorMessageList"><s:property />
					<br></s:iterator>
				</s:if>
			</div>
			<div class="error-message">
				<s:if test="!#session.passwordErrorMessageList.isEmpty()">
					<s:iterator value="#session.passwordErrorMessageList"><s:property />
					<br></s:iterator>
				</s:if>
			</div>
			<div class="error-message">
				<s:if test="!#session.passwordIncorrectErrorMessageList.isEmpty()">
					<s:iterator value="#session.passwordIncorrectErrorMessageList"><s:property />
					<br></s:iterator>
				</s:if>
			</div>
			<div class="error-message">
				<s:if test="!#session.newPasswordErrorMessageList.isEmpty()">
					<s:iterator value="#session.newPasswordErrorMessageList"><s:property />
					<br></s:iterator>
				</s:if>
			</div>
			<div class="error-message">
				<s:if test="!#session.reConfirmationNewPasswordErrorMessageList.isEmpty()">
					<s:iterator value="#session.reConfirmationNewPasswordErrorMessageList"><s:property />
					<br></s:iterator>
				</s:if>
			</div>
			<div class="error-message">
				<s:if test="!#session.newPasswordIncorrectErrorMessageList.isEmpty()">
					<s:iterator value="#session.newPasswordIncorrectErrorMessageList"><s:property />
					<br></s:iterator>
				</s:if>
			</div>
		</div>
		<s:form id="inner-box" action="ResetPasswordConfirmAction">
			<table class="vertical-list-table">
				<tbody>
					<tr class="box-a">
						<th scope="row"><s:label value="ログインID"/></th>
						<td><s:textfield name="newLoginId" placeholder="ログインID" class="txt"/></td>
					</tr>
					<tr class="box-a">
						<th scope="row"><s:label value="現在のパスワード"/></th>
						<td><s:password name="password" placeholder="現在のパスワード" class="txt"/></td>
					</tr>
					<tr class="box-a">
						<th scope="row"><s:label value="新しいパスワード"/></th>
						<td><s:password name="newPassword" placeholder="新しいパスワード" class="txt"/></td>
					</tr>
					<tr class="box-a">
						<th scope="row"><s:label value="（再確認用）"/></th>
						<td><s:password name="reConfirmationPassword" placeholder="再入力してください" class="txt"/></td>
					</tr>
				</tbody>
			</table>
			<s:submit value="パスワード再設定" class="submit-btn-a"/>
		</s:form>
	</div>
</div>
<s:include value="footer.jsp"/>
</body>
</html>