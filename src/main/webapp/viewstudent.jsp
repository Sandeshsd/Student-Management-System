<%@page import="com.project.studentdto.Admin"%>
<%@page import="java.util.List"%>
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

<style>
.table{
margin: 10% 0% 0% 23%;
}
.home{
text-decoration: none;
background-color: black;
color: #fff;
border-radius: 4px;
padding:5px 8px;
margin: 50px;
}
.table h2{
font-size: 40px;
}
.table th{
background-color: black;
color: #f36e00;
border-top:none ;
border-bottom:1px solid #ff7200;
border-radius:4px;
border-left:2px  solid #fff;
border-right:none ;
}
.table a{
text-decoration: none;
color: black;
transition:0.5s ease;
}
a:hover{
text-decoration: none;
background-color: black;
color:#ff7200 ;
border-radius: 5px;
padding:5px 8px;
margin:4% ;
}
.table td{
text-align: center;
}


</style>

<% Admin admin=(Admin) session.getAttribute("admin"); 
if(admin!=null) {
	List<Student> students=(List) (request.getAttribute("students")); %>
	
	<a class="home" href="dashboard.jsp">Home</a>
	<div class="table">	
<h2>student list</h2>
 <table  cellpadding="10px" cellspacing="0.5px">
  <thead>
  <tr>
      <th>studentId</th>
      <th>studentName</th>
      <th>studentEmail</th>
      <th>studentPhoneNumber</th>
      <th>studentFee</th>
      <th>updatestudent</th>
      <th>deletestudent</th>
      </tr>   
  </thead>
  
 <tbody>
  <% for(Student st: students) { %>
       <tr>  
      <td><%= st.getStudentId() %></td>
      <td><%= st.getStudentName() %></td>
      <td><%= st.getStudentEmail() %></td>
      <td><%= st.getStudentPhoneNumber() %></td>
      <td><%=  st.getStudentFee() %></td>
      <td><a href="updatestudent?studentId=<%= st.getStudentId() %>">update</a></td>
      <td><a href="deletestudent?studentId=<%= st.getStudentId() %>">delete</a></td>
      </tr>
      <% } %>
  </tbody>
  
 </table>
 </div>
<%}else{
	response.sendRedirect("adminlogin.jsp");
}
	
	%>

</body>
</html>