<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>** 회원 상세보기 **</h2>
<table>
	<tr><th>id</th><td>${member.id}</td></tr>
	<tr><th>name</th><td>${member.name}</td></tr>
	<tr><th>passwd</th><td>${member.passwd}</td></tr>
	<tr><th>reg_date</th><td>${member.reg_date}</td></tr>
	<tr>
		<td colspan="2">&nbsp;&nbsp;
			<a href="list">목록</a>&nbsp;&nbsp;
			<a href="update?id=${member.id}">수정</a>&nbsp;&nbsp;
			<a href="delete?id=${member.id}">삭제</a>&nbsp;&nbsp;
		</td>
	</tr>
</table>
</body>
</html>


















