package com.project.student_management_system;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.studentdto.Admin;

public class AdminLogout extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		Admin admin=(Admin) session .getAttribute("admin");
		
		if(admin!=null) {
			session.setAttribute("admin", null);
		}else {
			resp.sendRedirect("adminlogin.jsp");
		}
	}

}
