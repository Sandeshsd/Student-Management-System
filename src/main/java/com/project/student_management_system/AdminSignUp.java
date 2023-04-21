package com.project.student_management_system;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.studentdao.AdminDAO;
import com.project.studentdto.Admin;
@WebServlet("/signup")
public class AdminSignUp extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("adminName");
		String email=req.getParameter("adminEmail");
		String password=req.getParameter("adminPassword");
		
		Admin admin=new Admin();
		admin.setAdminName(name);
		admin.setAdminEmail(email);
		admin.setAdminPassword(password);
		
	new	AdminDAO().adminSinup(admin);
	
	req.getRequestDispatcher("adminlogin.jsp").forward(req, resp);
	}

}
