<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
</head>
<body>
	<table border="1">
		<tr><th>부서번호</th><th>부서명</th><th>부서전화</th><th>부서위치</th></tr>
		<c:forEach var="b" items="${bdetail}">
		<tr>
			<td>${b.buser_no}</td>
			<td>${b.buser_name}</td>
			<td>${b.buser_tel}</td>
			<td>${b.buser_loc}</td>
		</tr>
		</c:forEach>			
	</table>
</body>
</html>











