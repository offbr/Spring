<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>** 회원자료 수정 **</h2>
<form action="update" method="post">
번호 : ${dto.num}<br>
<input type="hidden" name="num" value="${dto.num}">
이름 : <input type="text" name="name" value="${dto.name}"><br>
주소 : <input type="text" name="addr" value="${dto.addr}"><br>
<input type="submit" value="수정완료">
<a href="javascript:history.back()">돌아가기</a>
</form>
</body>
</html>