<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인</h2>
<a href="index.jsp"><button>HOME</button></a><br><br>
<form action="login" method="post">
사번 : <input type="text" name="sawon_no"><br>
이름 : <input type="text" name="sawon_name">
<input type="submit" value="확인"><br>
<div style="color: red;"><c:out value="${log}"/></div>

</form>
</body>
</html>