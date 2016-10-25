<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 영화 리스트 -->
<div class="row"></div>
<c:set var="c" value="0"/>

<c:if test="${not empty movie_detail.channel.item }">
	<c:forEach var="l" items="${movie_detail.channel.item }">
		<c:set var="c" value="${c+1 }"/>
		<c:if test="${c == 1 }">
			<div class="row">
		</c:if>						
		<div class="col m3 l3">
			<div class="card">
			    <div class="card-image waves-effect waves-block waves-light">
			    	<c:forEach var="p" items="${l.thumbnail }">
			    		<c:set var="poster" value="${p.content}" />
			    	</c:forEach>
			    	<img class="activator" src="${poster}">	    		
			    </div>
			    <div class="card-content">
			    	<c:forEach var="t" items="${l.title }">
				        <c:set var="title" value="${t.content}" />
			    	</c:forEach>
	   				<c:set var="titlecut" value="${fn:substring(title, 0, 12) }" />
			      	<p>
			      		<!-- Modal Trigger -->
			      		<a href="javascript:mymodal('${title}')"> 
			      			${titlecut }
			      			<c:if test="${fn:length(title) > 12 }">...</c:if>
			      		</a>
			      		<!-- <i class="card-title activator material-icons right">more_vert</i> -->
			      	</p>
			    </div>
			    <div class="card-reveal">
					<span class="card-title grey-text text-darken-4">${title }<i class="material-icons right">close</i></span>
					<p>
						장　 　르 ㅣ <c:forEach var="g" items="${l.genre }">${g.content} </c:forEach><br/>
				    	감　 　독 ㅣ <c:forEach var="d" items="${l.director }">${d.content} </c:forEach><br/>
				    	출연배우 ㅣ <c:forEach var="a" items="${l.actor }">${a.content} </c:forEach><br/>
				    	제작년도 ㅣ <c:forEach var="y" items="${l.year }">${y.content} </c:forEach><br/>
				    	제작국가 ㅣ <c:forEach var="n" items="${l.nation }">${n.content} </c:forEach><br/>
				    	줄 거 리 ㅣ	 <c:forEach var="s" items="${l.story }">${s.content} </c:forEach><br/>				    						    						    						    	
					</p>
			    </div>
			</div>
        </div>
		<c:if test="${c == 4 }">
			</div>
			<c:set var="c" value="0"/>
		</c:if>	        			
	</c:forEach>
   </c:if>
</body>
</html>