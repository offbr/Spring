<!DOCTYPE html>

<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<h2>${data}</h2>
		foward는 
		<br>뷰에서 커맨드 객체 접근 가능 : ${sangpumBean.sang} 
		<br>뷰에서 커맨드 객체 접근 별명으로 접근 가능 : ${my.sang}
		<br>
		<br>뷰에서 직접 전달되는 모델 자료 출력하기<br>
		<%
		ArrayList<String> list = (ArrayList)request.getAttribute("mylist");
		for(String s : list){
			out.print(s + "&nbsp;&nbsp;");
		}
		%>
		<br>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<c:forEach var="s" items="${mylist}">
			${s}
		</c:forEach>
	</body>
</html>











