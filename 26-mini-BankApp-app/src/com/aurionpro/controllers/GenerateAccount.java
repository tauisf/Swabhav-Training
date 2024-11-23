package com.aurionpro.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.exception.CustomerNotFounded;
import com.aurionpro.service.GenerateBankAccount;


@WebServlet("/GenerateAccount")
public class GenerateAccount extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
		String customerIdParam = request.getParameter("customerId");
		boolean accountGenearted = false;
		GenerateBankAccount generateAccount = new GenerateBankAccount();
		
		if (customerIdParam == null || customerIdParam.trim().isEmpty() || !customerIdParam.matches("\\d+")) {
			  request.setAttribute("AddAccount", "AddAccount");
	            request.getRequestDispatcher("/AdminDashboard.jsp").forward(request, response);
	            return;
	        } 
		
		    
		        accountGenearted =  generateAccount.GenerateAccount(customerIdParam);
	             
	                if (accountGenearted) {
	                    request.setAttribute("successMessage", "Account created successfully!");
	                    
	                } else {
	                    request.setAttribute("errorMessage", "Error creating account.");
	                    
	                }
	                request.setAttribute("AddAccount", "AddAccount");
	                request.getRequestDispatcher("/AdminDashboard.jsp").forward(request, response);
		}catch(CustomerNotFounded e) {
			request.setAttribute("errorMessage", "Customer Does not Exist.");
			 request.setAttribute("AddAccount", "AddAccount");
             request.getRequestDispatcher("/AdminDashboard.jsp").forward(request, response);
		} catch (SQLException e) {
			request.setAttribute("errorMessage", "Error creating account.");
			 request.setAttribute("AddAccount", "AddAccount");
            request.getRequestDispatcher("/AdminDashboard.jsp").forward(request, response);
			e.printStackTrace();
		}
		 
	    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
