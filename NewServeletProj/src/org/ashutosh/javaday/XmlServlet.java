package org.ashutosh.javaday;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Making it just so i can add URL patterns not directly but using web.xml or Deployment descriptor
public class XmlServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String userId=request.getParameter("userId");
		PrintWriter writer=response.getWriter();
		writer.println("<h3>fuck u asshole from get</h3> "+username+"<h3> with userId </h3>"+userId);
		
				
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String userId=request.getParameter("userId");
		String prof=request.getParameter("prof");
		PrintWriter writer=response.getWriter();
		writer.println("<h3>fuck u asshole from post</h3> "+username+"<h3> with userId </h3>"+userId+"<h3>your profession is</h3>"+prof);
		
				
		
	}
}
