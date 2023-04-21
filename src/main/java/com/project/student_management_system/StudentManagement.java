package com.project.student_management_system;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.studentdao.AdminDAO;
import com.project.studentdao.StudentDAO;
import com.project.studentdto.Admin;
import com.project.studentdto.Student;
@WebServlet("/save")
public class StudentManagement extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		Admin admin =(Admin)session.getAttribute("admin");
		if(admin!=null) {
		String studentName=req.getParameter("studentName");
		String studentEmail=req.getParameter("studentEmail");
		String studentphonenumber=req.getParameter("studentPhoneNumber");
		
		long studentPhoneNumber=Long.parseLong(studentphonenumber);
		
		ServletContext context =getServletContext();
		String stfee=context.getInitParameter("studentFee");
		double studentFee=Double.parseDouble(stfee);
		
		Student student=new Student();
		student.setStudentName(studentName);
		student.setStudentEmail(studentEmail);
		student.setStudentPhoneNumber(studentPhoneNumber);
		student.setStudentFee(studentFee);
		student.setAdmin(admin);
		
		 new StudentDAO().saveStudent(student);
		 
		 List<Student> students=admin.getStudents();
		 students.add(student);
		 new AdminDAO().updateAdmin(admin);
		
		 resp.sendRedirect("dashboard.jsp");
		}else {
			resp.sendRedirect("adminlogin.jsp");
		}
		
		
	}

}
