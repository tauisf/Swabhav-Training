package com.aurionpro.controllers;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.aurionpro.entity.Transactions;
import com.aurionpro.exception.TransactionNotFound;
import com.aurionpro.service.TransactionService;

@WebServlet("/PassBookController")
public class PassBookController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   // Assume customerId is obtained from session
		
        String username =  (String) request.getSession().getAttribute("username");
        
        String accountNumber = request.getParameter("accountNumber");
        String transactionType = request.getParameter("transactionType");
        TransactionService service = new TransactionService();
        List<Transactions> transactions;
        
        try {
		        if (accountNumber != null && !accountNumber.isEmpty()) {
					// Fetch transaction using AccountNumber 
		             transactions	= service.getCustomerTransactionByAccountNumber(username, accountNumber);

				} else if(transactionType != null && !transactionType.isEmpty()){
					transactions =  service.getCustomerTransactionType(username, transactionType);
				}else if(transactionType != null && !transactionType.isEmpty() && accountNumber != null && !accountNumber.isEmpty()){
					transactions =  service.getCustomerTransactionByTypeAndAccountNumber(username, transactionType, accountNumber);
				}else  {
		           //Fetch all customers

					transactions= service.getCustomerTransaction(username);
				}
                // Set the transactions attribute to be used in the JSP
		        request.setAttribute("passbook","passbook");
		        request.setAttribute("transactions", transactions);
                request.getRequestDispatcher("/UserDashboard.jsp").forward(request, response);
            
        } catch (TransactionNotFound e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "An error occurred while fetching transactions.");
            request.getRequestDispatcher("/UserDashboard.jsp").forward(request, response);
        }
   
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
