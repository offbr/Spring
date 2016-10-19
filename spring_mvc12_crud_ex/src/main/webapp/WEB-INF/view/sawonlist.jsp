<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>사원 리스트</h2>
<table border="1" style="text-align: center;">
	<tr><th>사번</th><th>이름</th><th>직급</th><th>부서명</th><th>관리고객</th></tr>
	<c:forEach var="s" items="${slist}">
	<tr>
		<td>${s.sawon_no}</td>
		
		<c:if test="${s.count > 0}">
		<td><a href="gogeklist?s_no=${s.sawon_no}&name=${s.sawon_name}&jik=${s.sawon_jik}">${s.sawon_name}</a></td>
		</c:if>
		<c:if test="${s.count == null}">
		<td>${s.sawon_name}</td>
		</c:if>
		
		<td>${s.sawon_jik}</td>
		<td>${s.buser_name}</td>
		
		<c:if test="${s.count > 0}">
		<td>O</td>
		</c:if>
		<c:if test="${s.count == null}">
		<td>X</td>
		</c:if>
	</tr>
	</c:forEach>
</table>
</body>
</html>