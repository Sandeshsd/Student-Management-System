<%@page import="com.project.studentdto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management System</title>
</head>
<body>
<body>
<% Student student=(Student)request.getAttribute("student"); %>
 
<form action="saveupdatestudent" method="post">
 <input type="text" placeholder="studentId" name="studentId" value="<%student.getStudentId();  %>" readonly="readonly" > <br>
  <input type="text" placeholder="student name" value="<%student.getStudentName(); %>" name="studentName"><br>
 <input type="email" placeholder="student email" value="<%student.getStudentEmail(); %>" name="studentEmail"> <br>
 <input type="text" placeholder="student phone number" value="<%student.getStudentPhoneNumber(); %>" name="studentPhoneNumber"> <br>
  <input type="email" placeholder="student fee" value="<%student.getStudentFee(); %>" name="studentFee" readonly="readonly"> <br>
 <input type="submit" value="save">
 </form>
</body>
</html>