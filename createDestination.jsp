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
<title>宛先情報入力画面</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="main">
	  <div id="navigater"><h2>宛先情報入力画面</h2></div>
      <div id="container">

	<s:if test="familyNameErrorMessageList !=null">
		<s:iterator value="familyNameErrorMessageList"><s:property /><br></s:iterator>
	</s:if>

	<s:if test="firstNameErrorMessageList !=null">
		<s:iterator value="firstNameErrorMessageList"><s:property /><br></s:iterator>
	</s:if>

	<s:if test="familyNameKanaErrorMessageList !=null">
		<s:iterator value="familyNameKanaErrorMessageList"><s:property /><br></s:iterator>
	</s:if>

	<s:if test="firstNameKanaErrorMessageList !=null">
		<s:iterator value="firstNameKanaErrorMessageList"><s:property /><br></s:iterator>
	</s:if>

	<s:if test="userAddressErrorMessageList !=null">
		<s:iterator value="userAddressErrorMessageList"><s:property /><br></s:iterator>
	</s:if>

	<s:if test="telNumberErrorMessageList !=null">
		<s:iterator value="telNumberErrorMessageList"><s:property /><br></s:iterator>
	</s:if>

	<s:if test="emailErrorMessageList !=null">
		<s:iterator value="emailErrorMessageList"><s:property /><br></s:iterator>
	</s:if>

<s:form action="CreateDestinationConfirmAction">


	<s:label value="姓"/>
		<s:textfield name="familyName"/>
<br>
	<s:label value="名"/>
		<s:textfield name="firstName"/>
<br>
	<s:label value="姓ふりがな"/>
	 	<s:textfield name="familyNameKana"/>
<br>
	<s:label value="名ふりがな"/>
		<s:textfield name="firstNameKana"/>
<br>
	<s:label value="住所"/>
		<s:textfield name="userAddress"/>
<br>
	<s:label value="電話番号"/>
		<s:textfield name="telNumber"/>
<br>
	<s:label value="メールアドレス"/>
		<s:textfield name="email"/>

<br>
<br>

<s:submit value="確認"/>

</s:form>
      </div>
</div>
</body>
</html>
