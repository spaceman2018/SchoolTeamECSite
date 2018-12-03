<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/i1810c.css">
<link rel="stylesheet" type="text/css" href="./css/product.css">
<title>商品一覧</title>
</head>
<body>
<s:include value="header.jsp" />
<div id="product-list-contents">
<h1>商品一覧</h1>
	<s:if test="!keywordsErrorMessageList.isEmpty()">
		<div class="error">
		<div class="error-message">
			<s:iterator value="%{keywordsErrorMessageList}"><s:property /><br></s:iterator>
		</div>
		</div>
	</s:if>
	<s:if test="#session.productInfoDtoList==null">
		<div class="info">検索結果がありません。</div>
	</s:if>
	<s:else>
		<div id="product-list">
			<s:iterator value="#session.productInfoDtoList">
			<div class="product-list-box">
			<ul>
				<li>
					<a href='<s:url action="ProductDetailsAction">
					<s:param name="productId" value="%{productId}"/>
					</s:url>'><img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="item-image-box-200"/><br>
					<span class="pnk1"><s:property value="productNameKana"/></span><br>
					<span class="pn1"><s:property value="productName"/></span><br>
					<span class="pri1"><s:property value="price"/>円</span></a><br>
  				</li>
			</ul>
			</div>
			</s:iterator>
		</div>
		<div id="product-pager">
			<s:iterator begin="1" end="#session.totalPageSize" status="pageNo">
			<s:if test="#session.currentPageNumber == #pageNo.count">
				<s:property value="%{#pageNo.count}"/>
			</s:if>
			<s:else>
				<span><a href="<s:url action='SearchItemAction'><s:param name='pageNo' value='%{#pageNo.count}'/><s:param name='categoryId' value='%{categoryId}'/><s:param name='keywords' value='%{keywords}'/></s:url> ">	<s:property value="%{#pageNo.count}"/></a></span>
			</s:else>
			</s:iterator>
		</div>
	</s:else>
</div>
<s:include value="footer.jsp"/>
</body>
</html>