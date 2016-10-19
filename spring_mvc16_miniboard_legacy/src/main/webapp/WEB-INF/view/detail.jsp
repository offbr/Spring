<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>** 상세보기 **</h2>

<table border="1">
	<tr>
	<th>번호</th>
	<td>${dto.num}</td>
	</tr>
	
	<tr>
	<th>제목</th>
	<td>${dto.title}</td>
	</tr>
	
	<tr>
	<th>작성자</th>
	<td>${dto.author}</td>
	</tr>
	
	<tr>
	<th>내용</th>
	<td width="311" height="100">${dto.content}</td>
	</tr>
	
	<tr>
	<th>조회수</th>
	<td>${dto.readcnt}</td>
	</tr>
	
	<tr style="text-align: center;">
	<td colspan="2">
	<a href="update?num=${dto.num}">수정</a>
	<a href="delete?num=${dto.num}">삭제</a>
	<input type="button" value="돌아가기" onclick="javascript:history.back()">
	</td>
	</tr>
</table>

</body>
</html>