<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/i1810c.css">
<link rel="stylesheet" type="text/css" href="./css/form.css">
<link rel="stylesheet" type="text/css" href="./css/footer.css">
<title>登録確認画面</title>
</head>
<body>
	<s:include value="header.jsp"/>
		<div id="contents">
    	<h1>登録内容確認画面</h1>
    		<div id="create-box">
   				<s:form action="CreateUserCompleteAction">
					<table id="inner-box">
						<tr>
           					<th>姓</th>
           						<td>：</td>
            					<td><s:property value="familyName"/></td>
            			</tr>
            			<tr>
            				<th>名</th>
            					<td>：</td>
            					<td><s:property value="firstName"/></td>
           				</tr>
          				<tr>
            				<th>姓ふりがな</th>
            					<td>：</td>
            					<td><s:property value="familyNameKana"/></td>
						</tr>
            			<tr>
            				<th>名ふりがな</th>
            					<td>：</td>
           						<td><s:property value="firstNameKana"/></td>
            			</tr>
            			<tr>
            				<th>性別</th>
            					<td>：</td>
            					<td><s:property value="sexWord"/></td>
            			</tr>
            			<tr>
            				<th>メールアドレス</th>
            					<td>：</td>
            					<td><s:property value="email"/></td>
            			</tr>
           				<tr>
            				<th>ログインID</th>
            					<td>：</td>
            					<td><s:property value="loginId"/></td>
            			</tr>
            			<tr>
            				<th>パスワード</th>
            					<td>：</td>
            					<td><s:property value="password"/></td>
            			</tr>
					</table>
					<s:submit class="form-submit" value="登録情報を確定"/>
   				</s:form>
   			</div>
 		</div>
	<s:include value="footer.jsp"/>
</body>
</html>