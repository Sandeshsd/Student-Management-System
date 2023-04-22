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
 
 <style>
.form{
margin-top:9%;
background-color:#000000d1;
  width: 250px;
  height: 450px;
  background: linear-gradient(to top,rgba(0,0,0,0.8)50%,rgba(0,0,0,0.8)50%));
  position: absolute;
  top:18px;
  left:630px;
  border-radius: 10px;
  padding: 25px;
}
.form h2{
  width: 220px;
  font-family: sans-serif;
  text-align:center;
  border-bottom:1px solid #ff7200;
  border-top:none;
  border-left:none;
  border-right:none;
  color:#ff7200;
  font-size:22px;
  background-color:#141414;
  border-radius: 40px;
  margin:8px;
  padding: 5.8px;
}
.btn{
  width: 240px;
  height:35px;
  background:transparent;
  border-bottom:2px solid #ff7200;
  border-radius:5px;
  border-top:none;
  border-left:none;
  border-right:none;
  font-size:15px;
  margin-top:30px;
   font-family: sans-serif;
  color:#fff;
}
.btm{
width:80px;
height:28px;
background-color: #ff7200;
border: none;
margin-top: 16px;
font-size: 13px;
border-radius: 10px;
cursor: pointer;
color: #fff;
transition:0.5s ease;
}
.btm:hover {
	background: #fff;
	color: #ff7200;
}

</style>
 
 <div class="form">
 <h2>Update Student</h2>
<form  action="saveupdatestudent" method="post">
 <input class="btn" type="text" placeholder="studentId" name="studentId" value="<%student.getStudentId();  %>" readonly="readonly" > <br>
  <input class="btn" type="text" placeholder="student name" value="<%student.getStudentName(); %>" name="studentName" required="required"><br>
 <input class="btn" type="email" placeholder="student email" value="<%student.getStudentEmail(); %>" name="studentEmail" required="required"> <br>
 <input class="btn" type="text" placeholder="student phone number" value="<%student.getStudentPhoneNumber(); %>" name="studentPhoneNumber" required="required"> <br>
  <input class="btn" type="email" placeholder="student fee" value="<%student.getStudentFee(); %>" name="studentFee" readonly="readonly"> <br>
 <input class="btm" type="submit" value="update">
 </form>
 </div>
</body>
</html>