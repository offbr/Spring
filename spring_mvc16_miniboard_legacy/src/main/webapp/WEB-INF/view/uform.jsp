<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>** 글수정 **</h2>
<form action="update" method="post">
<table border="1">
	<tr>
	<th>번호</th>
	<td>${dto.num}</td>
	</tr>
	
	<tr>
	<th>제목</th>
	<td><input type="text" name="title" size="42" value="${dto.title}"></td>
	</tr>
	
	<tr>
	<th>작성자</th>
	<td><input type="text" name="author" size="42" value="${dto.author}"></td>
	</tr>
	
	<tr>
	<th>내용</th>
	<td><textarea name="content" rows="5" cols="40">${dto.content}</textarea></td>
	</tr>
	
	<tr>
	<th>조회수</th>
	<td>${dto.readcnt}</td>
	</tr>
	
	<tr style="text-align: center;">
	<td colspan="2">
	<input type="hidden" name="num" value="${dto.num}">
	<input type="submit" value="수정완료">
	<input type="button" value="돌아가기" onclick="javascript:history.back()">
	</td>
	</tr>
</table>

</form>
</body>
</html>