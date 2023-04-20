package com.project.student_management_system;

import javax.servlet.http.HttpServlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.studentdao.StudentDAO;
import com.project.studentdto.Student;


@WebServlet("/updatestudent")
public class UpdateStudent extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("studentId");
		Student student= new StudentDAO().getStudentById(Integer.parseInt(id));
		
		req.setAttribute("student", student);
		
		req.getRequestDispatcher("updatestudent.jsp").forward(req, resp);
	}
	}


