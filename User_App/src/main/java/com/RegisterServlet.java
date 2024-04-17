package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		String uname = req.getParameter("uname");
		String pword = (req.getParameter("pword"));
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String address = req.getParameter("address");
		String mid = req.getParameter("mid");
		long phno = Long.parseLong(req.getParameter("phno"));
		UserBean us = new UserBean(uname, pword, fname, lname, address, mid, phno);
		InsertDAO id = new InsertDAO();
		PrintWriter out = resp.getWriter();
		try {
			int k = id.insert(us);
			if (k > 0) {
				req.setAttribute("uname", uname);
				req.getRequestDispatcher("registersuccess.jsp").forward(req, resp);
			} else {
				out.print("Kindly enter valid details");
				req.getRequestDispatcher("register.html").include(req, resp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
