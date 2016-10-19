<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
<script type="text/javascript">
window.onload = function(){
	
}
</script>
</head>
<body>
	<h2>*자료 리스트*</h2>
	부서별 자료 보기 <a href="list">home</a>
	<form action="buserSearch" method="post">
	<select name="b_no">
		<option value="">전체</option>
	<c:forEach var="b" items="${blist}">
		<option value="${b.buser_no}">${b.buser_name}</option>
	</c:forEach>
		<option value="무소속">기타</option>
	</select>
	<input type="submit" value="검색">
	</form>
	
	<table border="1">
		<tr><th>사번</th><th>이름</th><th>부서명</th><th>직급</th><th>입사분기</th></tr>
		<c:forEach var="s" items="${slist}">
		<tr>
			<td>${s.sawon_no}</td>
			<td>${s.sawon_name}</td>
			<td><a href="buserdetail?b_no=${s.buser_no}" target="iframe">${s.buser_name}</a></td>
			<td>${s.sawon_jik}</td>
			<td>${fn:substring(s.sawon_ibsail,0,fn:indexOf(s.sawon_ibsail,'-'))}년도
				<c:if test="${fn:substring(s.sawon_ibsail,6,7) > 0 && fn:substring(s.sawon_ibsail,6,7) <= 3}">
					1사분기			
				</c:if>
				<c:if test="${fn:substring(s.sawon_ibsail,6,7) > 3 && fn:substring(s.sawon_ibsail,6,7) <= 6}">
					2사분기			
				</c:if>
				<c:if test="${fn:substring(s.sawon_ibsail,6,7) > 6 && fn:substring(s.sawon_ibsail,6,7) <= 9}">
					3사분기			
				</c:if>
				<c:if test="${fn:substring(s.sawon_ibsail,6,7) > 9 && fn:substring(s.sawon_ibsail,6,7) <= 12}">
					4사분기			
				</c:if>
			</td>
		</tr>
		</c:forEach>
		<tr><td colspan="5" style="text-align: center;">인원수 : ${fn:length(slist)}</td></tr>
	</table>
	<iframe name="iframe" width="400"></iframe>
</body>
</html>











