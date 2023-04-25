<%@page import="com.project.studentdto.Admin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management System</title>
</head>
<body>
<style>
html{
overflow: hidden;
}
.form{
margin-top:6%;
background-color:#e7e4e4d1;
  width: 45%;
  height: 250px;
  background: linear-gradient(to top,rgba(0,0,0,0.8)50%,rgba(0,0,0,0.8)50%));
  position: absolute;
  top:26px;
  left:380px;
  border-radius: 10px;
  padding: 25px;
  text-align: centre;
}
.form h1{
font-size: 54px;
font-family:initial;
margin-left: 165px;
padding-bottom: -14px;
}
.form marquee{

margin-left:158px;
margin-right:105px;
}
.form a{
text-decoration: none;
margin-left: 40px;

}
.btn{
margin-left: 162px;

}
.btm{
border: 1px solid black;
border-radius: 7px;
padding:4px 7px;
background-color: black;
color: #fff;
transition: 0.5s ease;
}
.btm:hover{
color:#f36e00;
}



</style>
  <% Admin admin=(Admin) session.getAttribute("admin");
         if(admin!=null){  
  %>
  <div class="form">
 <h1>welcome admin</h1>
<marquee scrollamount="15" behavior="slide"><h2>You can manage students data here !</h2></marquee>
<div class="btn">
<a class="btm" href="savestudent.jsp">save student</a>
<a class="btm" href="viewstudents">view students</a>
</div>
</div>
<% }else{
	response.sendRedirect("adminlogin.jsp");
}
	%>
</body>
</html>