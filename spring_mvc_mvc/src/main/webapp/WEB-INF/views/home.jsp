<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<body>
<h1>
	Hello world!  
</h1>
시간은 
<P>  The time on the server is ${serverTime}. </P>
<a href="sub1">서브 1</a><br>
<a href="sub2?irum=tom">서브 2 - para</a><br> 
<a href="sub2?irum=james">서브 2 - para</a><br> 
</body>
</html>
