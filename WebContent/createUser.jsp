<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/i1810c.css">
<link rel="stylesheet" type="text/css" href="./css/form.css">
<link rel="stylesheet" type="text/css" href="./css/footer.css">
<title>ユーザー情報入力画面</title>
</head>
<body>
     <s:include value="header.jsp"/>
		<div id="contents">
        	<h1>アカウント新規登録</h1>
        	<div class="error">
				<s:if test="!#session.familyNameErrorMessageList.isEmpty()">
					<div class="error-message">
						<s:iterator value="#session.familyNameErrorMessageList"><s:property/><br></s:iterator>
					</div>
				</s:if>
			 	<s:if test="!#session.firstNameErrorMessageList.isEmpty()">
					<div class="error-message">
						<s:iterator value="#session.firstNameErrorMessageList"><s:property/><br></s:iterator>
					</div>
				</s:if>
				<s:if test="!#session.familyNameKanaErrorMessageList.isEmpty()">
					<div class="error-message">
						 <s:iterator value="#session.familyNameKanaErrorMessageList"><s:property/><br></s:iterator>
					</div>
				</s:if>
				<s:if test="!#session.firstNameKanaErrorMessageList.isEmpty()">
					<div class="error-message">
						<s:iterator value="#session.firstNameKanaErrorMessageList"><s:property/><br></s:iterator>
   					</div>
    			</s:if>
    			<s:if test="!#session.emailErrorMessageList.isEmpty()">
 					<div class="error-message">
 						<s:iterator value="#session.emailErrorMessageList"><s:property/><br></s:iterator>
					</div>
    			</s:if>
    			<s:if test="!#session.loginIdErrorMessageList.isEmpty()">
   					<div class="error-message">
   						<s:iterator value="#session.loginIdErrorMessageList"><s:property/><br></s:iterator>
       				 </div>
        		</s:if>
        		<s:if test="!#session.loginIdDuplicationErrorMessageList.isEmpty()">
   					<div class="error-message">
   						<s:iterator value="#session.loginIdDuplicationErrorMessageList"><s:property/><br></s:iterator>
       				</div>
        		</s:if>
        		<s:if test="!#session.passwordErrorMessageList.isEmpty()">
					<div class="error-message">
          				<s:iterator value="#session.passwordErrorMessageList"><s:property/><br></s:iterator>
          			</div>
            	</s:if>
            </div>

      			<div id="create-box">
     				<s:form action="CreateUserConfirmAction">
						<span class="form-heading">姓</span>
    						<s:textfield name="familyName" value="%{familyName}" class="form-txt"/>
    					<span class="form-heading">名</span>
    						<s:textfield name="firstName" value="%{firstName}" class="form-txt"/>
    					<span class="form-heading">姓ふりがな</span>
    						<s:textfield name="familyNameKana" value="%{familyNameKana}" class="form-txt"/>
     					<span class="form-heading">名ふりがな</span>
     						<s:textfield name="firstNameKana" value="%{firstNameKana}" class="form-txt"/>
       					<span class="form-heading">性別</span>
       					<s:if test="sex == null || sex.equals(0)">
        					<div class="form-radio">
	        					<input type="radio" name="sex" value="0" checked="checked">男性
	        								　
	        					<input type="radio" name="sex" value="1" >女性
	        				</div>
       					</s:if>
        				<s:else>
       						<div class="form-radio">
	       						<input type="radio" name="sex" value="0">男性
	       									　
	       						<input type="radio" name="sex" value="1" checked="checked">女性
	       					</div>
        				</s:else>
        				<span class="form-heading">メールアドレス</span>
         					<s:textfield name="email" value="%{email}" class="form-txt"/>
         				<span class="form-heading">ログインID</span>
          					<s:textfield name="loginId" value="%{loginId}" class="form-txt"/>
          				<span class="form-heading">パスワード</span>
           				<s:password name="password" class="form-txt"/>
           				<s:submit class="form-submit" value="登録情報を確認"/>
           			</s:form>
         		</div>
         </div>
	<s:include value="footer.jsp"/>
</body>
</html>