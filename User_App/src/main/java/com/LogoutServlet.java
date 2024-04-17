package com;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] ck = req.getCookies();
		if(ck==null) {
			req.setAttribute("msg", "Session Expired..<br>");
		}else {
			ck[0].setMaxAge(0);
			resp.addCookie(ck[0]);
			req.setAttribute("msg", "User Logged out successfully.<br>");
		}
		
		req.getRequestDispatcher("Msg.jsp").forward(req, resp);	
		
		
	}
}
