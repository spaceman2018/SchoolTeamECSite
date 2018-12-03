<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/i1810c.css">
<link rel="stylesheet" type="text/css" href="./css/product.css">
<title>商品詳細</title>
</head>
<body>
<s:include value="header.jsp" />
<div id="product-details-contents">
	<s:form action="AddCartAction">
			<div class="2column-container">
				<div class="left">
				<h1>商品画像</h1>
				    <div class="img">
				    <img src='<s:property value="%{#session.imageFilePath}"/>/<s:property value="%{#session.imageFileName}"/>' class="item-image-box-320"/><br>
					</div>
				</div>
				<div class="right">
				<h1>商品詳細</h1>
				  <table class="common-table">
				    <tr>
					  <th scope="row"><s:label value="商品名"/></th>
					  <td><s:property value="%{#session.productName}"/></td>
					</tr>
					<tr>
					  <th scope="row"><s:label value="商品名ふりがな"/></th>
					  <td><s:property value="%{#session.productNameKana}"/></td>
					</tr>
					<tr>
					  <th scope="row"><s:label value="値段"/></th>
					  <td><s:property value="%{#session.price}"/>円</td>
					</tr>
					<tr>
					  <th scope="row"><s:label value="購入個数"/></th>
					  <td><s:select name="productCount" list="%{#session.productCountList}"/>個</td>
					</tr>
					<tr>
					  <th scope="row"><s:label value="発売会社名"/></th>
					  <td><s:property value="%{#session.releaseCompany}"/></td>
					</tr>
					<tr>
					  <th scope="row"><s:label value="発売年月日"/></th>
					  <td><s:property value="%{#session.releaseDate}"/></td>
					</tr>
					<tr>
					  <th scope="row"><s:label value="商品詳細情報"/></th>
					  <td><s:property value="%{#session.productDescription}"/></td>
					</tr>
				  </table>
			      <div class="submit-btn-box">
					<s:submit value="カートに追加" class="submit-btn" />
					<s:hidden name="originalToken" value="%{originalToken}" />
				  </div>
				</div>
				<div class="bottom">
				<div class="product-details-recomｍend-box">
					  <h4>[関連商品]</h4>
					  <s:iterator value="#session.productInfoDtoList">
					  <div class="recommend-box">
				      <a href='<s:url action="ProductDetailsAction">
				      <s:param name="productId" value="%{productId}"/>
				      </s:url>'><img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="item-image-box-100"/>
				      <span class="pn2"><s:property value="productName"/></span><br>
				      <span class="pri2"><s:property value="price"/>円</span><br></a>
				      </div>
			          </s:iterator>
		              </div>
				</div>
		</div>
	</s:form>
</div>
<s:include value="footer.jsp"/>
</body>
</html>