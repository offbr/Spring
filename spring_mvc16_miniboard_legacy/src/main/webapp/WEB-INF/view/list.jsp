<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>** 미니 게시판(전통적 DB연결) **</h2>
<a href="write">글쓰기</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="list">Home</a>
<table border="1" style="text-align: center;">
	<!-- 검색 -->
	<tr>
		<td colspan="5">
			<form action="search" method="post">
				<select name="name">
					<option value="title">제목</option>
					<option value="author">작성자</option>
				</select>			
				<input type="text" name="value">
				<input type="submit" value="검색">
			</form>
		</td>
	</tr>
	
	<tr><th>번호</th><th>제목</th><th>작성자</th><th>작성일</th><th>조회수</th></tr>
	<c:forEach var="b" items="${list}">
		<tr>
			<td>${b.num}</td>
			<td width="200"><a href="detail?num=${b.num}">${b.title}</a></td>
			<td>${b.author}</td>
			<td>${fn:substring(b.bwrite, 0, 10)}</td>
			<td>${b.readcnt}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>