<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>자료입력 : spring tag</h2>
<sform:form commandName="command"> <!-- @ModelAttribute 맞춘다. 없을 시 기본값은 command-->
id : <sform:input path="userid"/><sform:errors path="userid" />
<br>
pw : <sform:password path="passwd"/><sform:errors path="passwd" />
<br>
<input type="submit" value="전송">
</sform:form>
<hr>

</body>
</html>