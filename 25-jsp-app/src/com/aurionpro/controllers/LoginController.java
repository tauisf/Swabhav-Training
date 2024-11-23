package com.aurionpro.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		RequestDispatcher dispatcher =null;
		String type	= request.getParameter("loginType");
		
		request.setAttribute("type", type);
		if((type).toLowerCase().equals("user"));
			dispatcher=  request.getRequestDispatcher("/UserDashboard.jsp");
			
		
		if((type).toLowerCase().equals("user"));
			dispatcher=  request.getRequestDispatcher("/AdminDashboard.jsp");
	
			
			dispatcher.forward(request, response);
	}
		
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
