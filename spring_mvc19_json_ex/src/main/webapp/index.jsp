<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>*Ajax*</h2>
<%String sawon_name = (String)session.getAttribute("sawon_name");
if(sawon_name != null && !sawon_name.equals("")){
	out.print("환영합니다 <strong>"+ sawon_name +"</strong>님 <a href='logout'><button>로그아웃</button></a>");	
}
 %>	
<span style="color: blue;">${param.log}</span><br>
<a href="gogekSearch"><button>고객</button></a>
<a href="buserSearch"><button>부서</button></a>
</body>
</html>



