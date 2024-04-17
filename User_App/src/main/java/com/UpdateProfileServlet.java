package com;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateProfileServlet  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] ck = req.getCookies();
		if (ck == null) {
			req.setAttribute("msg", "Session expired.");
			req.getRequestDispatcher("Msg.jsp").forward(req, resp);
		} else {
			String fname = ck[0].getValue();
			req.setAttribute("fname", fname);
			ServletContext sct = req.getServletContext();
			UserBean ub = (UserBean) sct.getAttribute("Ubean");
			ub.setAddress(req.getParameter("address"));
			ub.setMid(req.getParameter("mid"));
			ub.setPhno(Long.parseLong(req.getParameter("phno")));
			int k = new UpdateProfileDAO().update(ub);
			if(k>0) {
				req.setAttribute("msg", "Profile Updated Successfully.<br>");
				req.getRequestDispatcher("UpdateProfile.jsp").forward(req, resp);
	    
			}

		}
	
	}
}
