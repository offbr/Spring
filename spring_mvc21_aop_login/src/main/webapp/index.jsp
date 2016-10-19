<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
</head>
<body>
	<%String name = (String)session.getAttribute("name");
	if(name != null && !name.equals("")){
		out.print("환영합니다 <strong>"+ name +"</strong>님 <a href='logout'><button>로그아웃</button></a>");	
	}
 	%>	
	<a href="sawon">직원 자료</a>
</body>
</html>
