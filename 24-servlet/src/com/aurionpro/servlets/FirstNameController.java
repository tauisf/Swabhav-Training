package com.aurionpro.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstNameController")
public class FirstNameController extends HttpServlet {
	
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter  writer =  response.getWriter();
		String firstname= request.getParameter("firstname");
		writer.print("<h1>Good Morning :"+firstname+ "</h1>");
		writer.print("<form action ='LastnameController'>");
		writer.print("Last name : <input type='text' name='lastname'>");
		writer.print("<button type='submit'>Go</button>");
		writer.print("</form>");
		
		
		Cookie cookie1 = new Cookie("firstname",firstname);
		response.addCookie(cookie1);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
