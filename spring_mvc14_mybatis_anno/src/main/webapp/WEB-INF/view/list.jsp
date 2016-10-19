<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>** 상품 자료(MVC + MyBatis Annotation) **</h2>
<table border="1">
	<!-- 검색 -->
	<tr>
		<td colspan="4">
			<form action="search" method="post">
			상품명 : <input type="text" name="searchValue">
			<input type="submit" value="검색">
			<a href="list">목록</a>
			</form>
		</td>
	</tr>
	
	<tr><th>코드</th><th>상품</th><th>수량</th><th>단가</th></tr>
	<c:forEach var="s" items="${data}">
		<tr>
			<td>${s.code}</td>
			<td>${s.sang}</td>
			<td>${s.su}</td>
			<td>${s.dan}</td>
		</tr>
	</c:forEach>
	
</table>
</body>
</html>