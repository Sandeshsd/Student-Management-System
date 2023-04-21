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
<% Admin admin=(Admin) session.getAttribute("admin"); 
if(admin!=null) {
	List<Student> students=(List) (request.getAttribute("students")); %>
<h2>student list</h2>
 <table border="" cellpadding="5px" cellspacing="">
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
<a href="dashboard.jsp">Home</a>

<%}else{
	response.sendRedirect("adminlogin.jsp");
}
	
	%>

</body>
</html>