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
<h2>** 이메일 작성 **</h2>
<form action="send" method="post">
메일 : <input type="email" name="receiver" placeholder="abc@abc.com"><br>
제목 : <input type="text" name="subject"><br>
내용 : <textarea rows="5" cols="50" name="content"></textarea>
<input type="submit" value="전송">
</form>
</body>
</html>