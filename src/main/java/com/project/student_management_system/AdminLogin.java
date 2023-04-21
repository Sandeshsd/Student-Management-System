package com.project.student_management_system;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.studentdao.AdminDAO;
import com.project.studentdto.Admin;
@WebServlet("/login")
public class AdminLogin extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
	String email=req.getParameter("adminEmail");
	String password=req.getParameter("adminPassword");
	
	Admin admin =new AdminDAO().adminLogin(email,password);
	
	if(admin!=null) {
		HttpSession session=req.getSession();
		session.setAttribute("admin", admin);
		req.getRequestDispatcher("dashboard.jsp").forward(req, resp);
	}else {
		resp.sendRedirect("adminsignup.jsp");
	}
	
	}

}
