<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>** 회원 수정 **</h2>
<form:form action="${dto.no}" method="put">
no : <input type="text" name="name" value="${dto.no}" disabled="disabled"><br>
name : <input type="text" name="name" value="${dto.name}"><br>
age : <input type="text" name="age" value="${dto.age}"><br>
tel : <input type="text" name="tel" value="${dto.tel}"><br>
<button type="submit">수정</button>
</form:form>
</body>
</html>