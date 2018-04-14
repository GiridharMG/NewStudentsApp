package com.jspiders.studentsapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, 
						 HttpServletResponse resp) 
	throws ServletException, IOException {
	
		//Get the ServletContext Object
		ServletContext ctx = getServletContext();
		ctx.setAttribute("ctxKey", new Object());
		
		req.setAttribute("reqKey", "My String Value");
		
		RequestDispatcher dispatcher
			= req.getRequestDispatcher("second");
		dispatcher.forward(req, resp);
		
		
		/*resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print(" Context & Request Attribute is Set ... ");
		*/
	}//End of doGet
}//End of Class












