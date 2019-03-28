<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<link rel="stylesheet" type="text/css" href="./css/style.css" >
<link href="https://fonts.googleapis.com/css?family=Roboto:300" rel="stylesheet"/>
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+JP" rel="stylesheet"/>
<link href="https://fonts.googleapis.com/css?family=Codystar" rel="stylesheet"/>
<meta name="description" content="">
<meta name="keywords" content=""/>
<title>マイページ画面</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="main">
	  <div id="navigater"><h2>マイページ画面</h2></div>
      <div id="container">

<s:if test="errorMesage !=''">
		<s:property value="errorMessage"/></s:if>
	</div>
	<s:form action="PurchaseHistoryAction">
	<table class="vertical-list-table">
		<tr>
			<th scope="row"><s:label value="姓"/></th>
			<td><s:property value="familyName"/></td>
		</tr>
		<tr>
			<th scope="row"><s:label value="名"/></th>
			<td><s:property value="firstName"/></td>
		</tr>
		<tr>
			<th scope="row"><s:label value="ふりがな"/></th>
			<td><s:property value="familyNsmeKana"/><span>　</span><s:property value="firstNameKana"/></td>
		</tr>
		<tr>
			<th scope="row"><s:label value="性別"/></th>
			<td><s:if test="sex==0">男性</s:if><s:if test="sex==1">女性</s:if></td>
		</tr>
		<tr>
			<th scope="row"><s:label value="メールアドレス"/></th>
			<td><s:property value="email"/></td>
		</tr>
	</table>

	<div class="submit btn box">
		<s:submit value="購入履歴" class="submit_btn"/>
	</div>
	</s:form>
</div>

</body>

</html>