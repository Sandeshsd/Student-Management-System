package com.project.student_management_system;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.studentdao.StudentDAO;
import com.project.studentdto.Student;
@WebServlet("/viewstudents")
public class GetAllStudents extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Student> students=new StudentDAO().getAllStudents();
		req.setAttribute("students", students);
	
		req.getRequestDispatcher("viewstudent.jsp").forward(req, resp);
	}

}
