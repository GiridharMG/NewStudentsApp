package com.jspiders.studentsapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, 
						 HttpServletResponse resp) 
	throws ServletException, IOException {
	
		//Get the ServletContext Object
		ServletContext ctx = getServletContext();
		String movie1Val = ctx.getInitParameter("movie1");
		String movie2Val = ctx.getInitParameter("movie2");
		
		//Get the ServletConfig Object
		ServletConfig config = getServletConfig();
		String actress1Val = config.getInitParameter("actress1");
		String actress2Val = config.getInitParameter("actress2");
		String actor1val = config.getInitParameter("actor1");
		String actor2val = config.getInitParameter("actor2");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print(" Movie 1 Value :- "+movie1Val);
		out.print(" Movie 2 Value :- "+movie2Val);
		out.print(" Actress 1 Value :- "+actress1Val);
		out.print(" Actress 2 Value :- "+actress2Val);
		out.print(" Actor 1 Value :- "+actor1val);
		out.print(" Actor 2 Value :- "+actor2val);
		
	}//End of doGet
}//End of Class












