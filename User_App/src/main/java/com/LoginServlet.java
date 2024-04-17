package com;

import java.io.IOException;

import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname = req.getParameter("uname");
		String pword = req.getParameter("pword");
		System.out.println(uname);
		System.out.println(pword);
		LoginDAO ld = new LoginDAO();
		try {
			UserBean userBean = ld.get(uname, pword);
			if (userBean != null) {
				/* Accessing servletContext Object reference */
				ServletContext sct = req.getServletContext();
				/* Adding Bean object to Context. */
				sct.setAttribute("Ubean", userBean);
				/* Cookie object */
				Cookie ck = new Cookie("fname", userBean.getFname());
				/* Adding Cookie to response */
				resp.addCookie(ck);
				req.setAttribute("ub", userBean);
				req.getRequestDispatcher("Login.jsp").forward(req, resp);
			} else {
				req.setAttribute("msg", "Login Failed check Uname & Password.");
				req.getRequestDispatcher("Msg.jsp").forward(req, resp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
