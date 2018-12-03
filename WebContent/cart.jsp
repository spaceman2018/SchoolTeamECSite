<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/i1810c.css">
<link rel="stylesheet" type="text/css" href="./css/cart.css">
<title>カート</title>
</head>
<body>
	<s:include value="header.jsp" />

	<div id="cart-contents">
		<h1 class="title">カート</h1>
		<s:if test="#session.checkListErrorMessageList!=null">
			<div class="error">
				<div class="error-message">
					<s:iterator value="#session.checkListErrorMessageList">
						<s:property />
					</s:iterator>
				</div>
			</div>
		</s:if>
		<s:if test="#session.cartInfoDtoList.size()>0">
			<s:form action="SettlementConfirmAction">
				<div class="cart-item">
					<div class="cart-border"></div>
					<s:iterator value="#session.cartInfoDtoList">
						<div class="item-check">
							<s:checkbox name="checkList" value="checked"
								fieldValue="%{productId}" />
						</div>
						<div class="item-img">
							<img
								src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' />
						</div>
						<table class="item-details">
							<tr>
								<th class="product-name">商品名</th>
								<td>：</td>
								<td class="product-name"><s:property value="productName" /></td>
							</tr>
							<tr>
								<th>ふりがな</th>
								<td>：</td>
								<td><s:property value="productNameKana" /></td>
							</tr>
							<tr>
								<th>値段</th>
								<td>：</td>
								<td><s:property value="price" />円</td>
							</tr>
							<tr>
								<th>発売会社名</th>
								<td>：</td>
								<td><s:property value="releaseCompany" /></td>
							</tr>
							<tr>
								<th>発売年月日</th>
								<td>：</td>
								<td><s:property value="releaseDate" /></td>
							</tr>
							<tr>
								<th>購入個数</th>
								<td>：</td>
								<td><s:property value="productCount" /></td>
							</tr>
							<tr>
								<th>合計金額</th>
								<td>：</td>
								<td><s:property value="subtotal" />円</td>
							</tr>
						</table>

						<div class="cart-border"></div>

					</s:iterator>

					<div class="cart-total">
						<s:label value="カート合計金額 :" />
						<s:property value="#session.totalPrice" />
						円
					</div>

					<div class="cart-btn">
						<s:submit value="決済" class="submit-btn" />
						<br>
						<s:submit value="削除" onclick="this.form.action='DeleteCartAction';"
							class="delete-btn" />
					</div>
				</div>
			</s:form>
		</s:if>
		<s:else>
			<h2>カートの情報はありません。</h2>
		</s:else>
	</div>

	<s:include value="footer.jsp" />

</body>

</html>