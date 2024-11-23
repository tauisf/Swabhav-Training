package com.aurionpro.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LastnameController")
public class LastnameController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter  writer =  response.getWriter();
		String lastname= request.getParameter("lastname");
		Cookie cookie[] = request.getCookies();
		String firstname  =  cookie[0].getValue();
		writer.print("<h1>Good Morning :"+firstname+ "</h1>");
		writer.print("<h1>Good Night :"+lastname+ "</h1>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
