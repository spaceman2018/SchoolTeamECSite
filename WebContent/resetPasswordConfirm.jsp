<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/i1810c.css">
<link rel="stylesheet" type="text/css" href="./css/resetPassword.css">
<title>パスワード再設定画面</title>
</head>
<body>
<s:include value="header.jsp"/>
<div id="contents">
	<div id="outbox1">
		<div class="title"><h1>確認画面</h1></div>
		<s:form id="inner-box" action="ResetPasswordCompleteAction">
			<table class="vertical-list-table">
			<tr>
				<th scope="row"><s:label value="ログインID"/></th>
				<td><s:property value="newLoginId"/></td>
			</tr>
			<tr>
				<th scope="row"><s:label value="新しいパスワード"/></th>
				<td><s:property value="#session.concealPassword"/></td>
			</tr>
			</table>
			<s:submit value="再設定" class="submit-btn-a"/>
		</s:form>
	</div>
</div>
<s:include value="footer.jsp"/>
</body>
</html>