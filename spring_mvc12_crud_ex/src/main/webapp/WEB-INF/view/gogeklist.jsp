<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>${param.name} ${param.jik}의 고객 리스트</h2>

<table border="1" style="text-align: center;">
	<tr><th>고객번호</th><th>고객명</th><th>성별</th><th>나이</th><th>전화</th></tr>
	<c:forEach var="g" items="${glist}">
	<tr>
		<td>${g.gogek_no}</td>
		<td>${g.gogek_name}</td>
		<td>${g.gogek_gen}</td>
		<td>${fn:substring(g.gogek_age,0,fn:indexOf(g.gogek_age,'.'))}</td>
		<td>${g.gogek_tel}</td>
	</tr>
	</c:forEach>
	<tr><td colspan="5">인원수 : ${fn:length(glist)}</td></tr>
</table>
</body>
</html>

