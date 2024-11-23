package com.aurionpro.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
			  Connection dbOp = null;
			  response.setContentType("text/html");
			  PrintWriter writer = response.getWriter();
			try {
				
			
				dbOp = DatabaseOperation.connect();

				String username = request.getParameter("username");
				String password = request.getParameter("password");

				System.out.println("Received username: " + username);
				System.out.println("Received password: " + password);

				PreparedStatement preparedStatement;

				preparedStatement = dbOp.prepareStatement("SELECT * FROM login WHERE username = ?");
				preparedStatement.setString(1, username);

				ResultSet resultSet = preparedStatement.executeQuery();
				boolean isValid = false;
				
					if (resultSet.next()) {
						if (password.equals(resultSet.getString("password"))) {
							isValid = true;
						}
					}
				preparedStatement.close(); 
				dbOp.close(); 
				
				if(isValid) {
				writer.print("<h2>Login Sucessfull</h2>");
				writer.close();
				return;
				}
				writer.print("<h2>Login failed </h2>");
				writer.close();
			}catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
