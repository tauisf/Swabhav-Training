package com.aurionpro.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseOperation {
	
	
	  protected static Connection connect() throws SQLException, ClassNotFoundException {
		    Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapp", "root", "1234");
			System.out.println("connection successfull");
		
		return connection;
		
	}
	
}