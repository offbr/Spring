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
<a href="index.jsp"><button>HOME</button></a>
<h2>** 파일 업로드 / 다운로드 **</h2>
업로드할 파일 선택<br>
<form:form enctype="multipart/form-data" modelAttribute="uploadBean">
<input type="file" name="file"><br>
<p><form:errors path="file" cssStyle="Color:red" /></p>
<input type="submit" value="전송" />
</form:form>
</body>
</html>