package com.aurionpro.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import com.aurionpro.entity.Customer;
import com.aurionpro.exception.CustomerNotFounded;

public class GenerateBankAccount {
	final double DEFAULT_BALANCE = 5000.0;
	private PreparedStatement preparedStatement;
	private  Connection connection;
	public GenerateBankAccount() {
		try {
			connection = DbConnect.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
		public boolean GenerateAccount(String customerIdParam) throws SQLException  {
			boolean accountGeneratedSuccessfully = false;
			 int customerId = Integer.parseInt(customerIdParam);
			String query = "Select * from customers where CustomerId = ? ";	
			try {
				connection.setAutoCommit(false);
				preparedStatement =  connection.prepareStatement(query);
				 preparedStatement.setInt(1, customerId);
				ResultSet resultSet = preparedStatement.executeQuery();
				
				if(!resultSet.next()) {
					throw new CustomerNotFounded();
				}
				String accountNumber = "ACC" + System.currentTimeMillis();
				String Query = "INSERT INTO accounts  VALUES ( ?, ?, ?)";
				preparedStatement =  connection.prepareStatement(Query);
				 preparedStatement.setInt(1, customerId);
	             preparedStatement.setString(2, accountNumber);
	             preparedStatement.setDouble(3, DEFAULT_BALANCE);
	             
	             int  rowsAffected = preparedStatement.executeUpdate();
	             
	             if(rowsAffected > 0)
	            	 accountGeneratedSuccessfully = true;
	             
				connection.commit();
			} catch (SQLException e) {
				connection.rollback();
				e.printStackTrace();
			}
			return accountGeneratedSuccessfully;
			
		}
	}
