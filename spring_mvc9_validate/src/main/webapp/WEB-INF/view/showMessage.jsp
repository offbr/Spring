<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
</head>
<body>
	<h1>
		<spring:message code="show.disp"></spring:message>
	</h1>
	<h2>환영 : ${message}</h2>
</body>
</html>
