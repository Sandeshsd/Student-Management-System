<%@page import="com.project.studentdto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<% Student student=(Student)request.getAttribute("student"); %>
 
<form action="saveupdateStudent" method="post">
 <input type="text"  name="studentId" value="<%student.getStudentId();  %>" readonly="readonly" > <br>
  <input type="text" value="<%student.getStudentName(); %>" name="studentName"><br>
 <input type="text" value="<%student.getStudentName(); %>" name="studentPhoneNumber"> <br>
 <input type="email" value="<%student.getStudentEmail(); %>" name="studentEmail"> <br>
  <input type="email" value="<%student.getStudentFee(); %>" name="studentFee" readonly="readonly"> <br>
 <input type="submit" value="save">
 </form>
</body>
</html>