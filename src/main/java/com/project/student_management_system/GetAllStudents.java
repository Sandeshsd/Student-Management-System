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
@WebServlet("/viewstudents")
public class GetAllStudents extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 HttpSession session = req.getSession();
		 Admin admin=(Admin)session.getAttribute("admin");
		 if(admin!=null) {
		List<Student> students=new StudentDAO().getAllStudents(admin);
		req.setAttribute("students", students);
	
		req.getRequestDispatcher("viewstudent.jsp").forward(req, resp);
	}else {
		resp.sendRedirect("adminlogin.jsp");
	}
	}

}
