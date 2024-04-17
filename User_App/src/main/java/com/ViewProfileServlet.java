package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
		Cookie[] ck = req.getCookies();
	    if(ck==null) {
	    	req.setAttribute("msg", "Session expired.");
	    	req.getRequestDispatcher("Msg.jsp").forward(req, resp);
	    }else {
	        String fname = ck[0].getValue(); 
	        req.setAttribute("fname", fname);
	        req.getRequestDispatcher("ViewProfile.jsp").forward(req, resp);
	    }
	
	
	}
}
