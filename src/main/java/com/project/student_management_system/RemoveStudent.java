package com.project.student_management_system;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.studentdao.StudentDAO;
import com.project.studentdto.Admin;
import com.project.studentdto.Student;
@WebServlet("/deletestudent")
public class RemoveStudent extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		 Admin admin=(Admin)session.getAttribute("admin");
		 
		 if(admin!=null) {
		String studentId=(String) req.getParameter("studentId");
		
		int id=Integer.parseInt(studentId);
		
		StudentDAO dao=new StudentDAO();
		
		dao.removeStudent(id);
		
		List<Student> students= dao.getAllStudents(admin);
		req.setAttribute("students", students);
		
		req.getRequestDispatcher("viewstudent.jsp").forward(req, resp);
		
	}else {
		resp.sendRedirect("adminlogin.jsp");
	}
	} 

}
