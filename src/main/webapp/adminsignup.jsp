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
.form{
margin-top:9%;
background-color:#000000d1;
  width: 250px;
  height: 360px;
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
<h2>Admin signup</h2>
   <form action="signup" method="post">
   <input class="btn" name="adminName" placeholder="enter name" type="text" required="required"><br><br>
   <input class="btn" name="adminEmail" placeholder="enter email" type="email" required="required"><br><br>
   <input class="btn" name="adminPassword" placeholder="enter password" type="password" required="required"><br><br>
   <input class="btm" type="submit" value="signup">
   </form>
 </div>
</body>
</html>