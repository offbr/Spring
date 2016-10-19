<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>** 회원자료 등록 **</h2>
<form action="insert" commandName="command" method="post">
번호 : <input type="text" name="num"><br>
이름 : <input type="text" name="name"><br>
주소 : <input type="text" name="addr" size="50"><br>
<input type="submit" value="등록">
<a href="javascript:history.back()">돌아가기</a>
</form>
</body>
</html>