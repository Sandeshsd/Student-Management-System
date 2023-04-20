package com.project.student_management_system;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.studentdao.StudentDAO;
import com.project.studentdto.Student;
@WebServlet("/save")
public class StudentManagement extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
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
		
		 new StudentDAO().saveStudent(student);
		
		 resp.sendRedirect("dashboard.jsp");
		
		
	}

}
