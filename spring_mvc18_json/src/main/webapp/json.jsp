<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">
   $(document).ready(function(){
      
      //btn1
      $("#btnOk1").on("click", function(){
         $("#showdata").html("");
         $.ajax({
            type: "get", url: "list", dataType: "json", data: {"name":"tom"},
            success:function(data){
               var ss = "";
               ss += data.name + "<br>";
               ss += data.skills[0] + " ";
               ss += data.skills[1] + " ";
               ss += data.skills[2] + " ";
               $("#showdata").append(ss);
            },
            error:function(){
               $("#showdata").html("error")
            }
         });
      });
    //btn2
      $("#btnOk2").on("click", function(){
         $("#showdata").html("");
         $.ajax({
            type: "get", url: "list2", dataType: "json",
            success:function(data){
               var str = "<table border = '1'>";
               var list = data.datas;
               $(list).each(function(index, objArr){
                  str += "<tr>";
                  str += "<td>" + objArr["name"] + "</td>";
                  str += "<td>" + objArr["age"] + "</td>";
                  str += "</tr>"
               });
               str += "</table>";
               $("#showdata").append(str);
            },
            error:function(){
               $("#showdata").html("error")
            }
         });
      
      });
      
   });
</script>
</head>
<body>
<h2> ** client가 요청한 json 처리 방법. ** </h2>
<input type = "button" value = "단일자료" id = "btnOk1">
<input type = "button" value = "복수자료" id = "btnOk2">
<hr>
<div id = "showdata">
</div>


</body>
</html>