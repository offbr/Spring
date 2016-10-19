<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원 자료</h2>
<a href="index.jsp">HOME</a>
<table border="1">
	<tr><th>no</th><th>name</th><th>age</th><th>tel</th><th>delete</th></tr>
	<c:forEach var="m" items="${list}">
		<tr>
			<td>${m.no}</td>
			<td>${m.name} <a href="member/${m.no}">수정</a></td>
			<td>${m.age}</td>
			<td>${m.tel}</td>
			<td>
				<form:form action="member/${m.no}" method="delete">
					<a href="javascript:" onclick="parentElement.submit()">삭제</a>
				</form:form>
			
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>