<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp"><button>HOME</button></a>
<h2> * 업로드한 파일 정보 * </h2>
파일명 : ${filename} <br>
<form action="download" method="post">
<input type="hidden" name="filename" value="${filename}">
<input type="submit" value="다운로드">
</form>
</body>
</html>