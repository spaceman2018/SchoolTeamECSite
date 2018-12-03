<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/header.css">
<title>header</title>
<script>
function goLoginAction(){
	document.getElementById("form").action="GoLoginAction";
}
function goMyPageAction(){
	document.getElementById("form").action="MyPageAction";
}
function goCartAction(){
	document.getElementById("form").action="CartAction";
}
function goProductListAction(){
	document.getElementById("categoryId").value=1;
	document.getElementById("form").action="ProductListAction";
}
function goLogoutAction(){
	document.getElementById("form").action="LogoutAction";
}
function goSearchItemAction(){
	document.getElementById("form2").action="SearchItemAction";
}

</script>
</head>
<body>
<header>
	<div id="header">
		<div id="box1">　
			<s:form id="form" name="form">
				<ul id="h-title">
					<li>i1810c</li>
				</ul>
				<ul id="h-menu">
					<s:if test="#session.logined=='logined'">
						<li><s:submit value="ログアウト" class="header-btn" onclick="goLogoutAction();" /></li>
					</s:if>
					<s:else>
						<li><s:submit value="ログイン" class="header-btn" onclick="goLoginAction();" /></li>
					</s:else>
						<li><s:submit value="カート" class="header-btn" onclick="goCartAction();" /></li>
						<li><s:submit value="商品一覧" class="header-btn" onclick="goProductListAction();" /></li>
					<s:if test="#session.logined=='logined'">
						<li><s:submit value="マイページ" class="header-btn" onclick="goMyPageAction();" /></li>
					</s:if>
				</ul>
			</s:form>
		</div>
		<div id="box2">
			<s:form id="form2" name="form2">
			<div class="form2-box">
				<s:if test='#session.containsKey("mCategoryDtoList")'>
					<div><s:select name="categoryId" list="#session.mCategoryDtoList" listValue="categoryName" listKey="categoryId" id="categoryId" class="cate"/></div>
				</s:if>
				<div><s:textfield name="keywords" class="txt-keywords" placeholder="検索ワード"/></div>
				<div><s:submit value="商品検索" class="search-btn" onclick="goSearchItemAction();" /></div>
			</div>
		    </s:form>
		</div>
	</div>
</header>
</body>
</html>