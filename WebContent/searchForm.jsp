<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- <form method="POST" action="tutorials/getTutorial.action">
		<input id="language" name="language" />
		<input type="submit">	
	</form> -->
	
	<s:form method="post" action="tutorials/getTutorial">
		<s:textfield label="Please Enter the language you want to search for:" key="language"/>
		<s:submit />
	</s:form>
</body>
</html>