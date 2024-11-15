package com.aurionpro.dbOrganisation;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;



public class TransactionDb {
	private Connection connection = null;
	private PreparedStatement preStatement = null;
	private Savepoint savepoint1 = null;
	private Statement statement;

	public void connect() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/organiasation", "root", "1234");
			System.out.println("connection successfull");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void setOfQuery() {
		 try {
		 connection.setAutoCommit(false);

         
         String sql1 = "UPDATE emp SET sal = sal + 1000 WHERE empid = ?";
         preStatement = connection.prepareStatement(sql1);
         preStatement.setInt(1, 7839); 
         int rowsAffected1 = preStatement.executeUpdate();
         System.out.println("Rows affected by first query: " + rowsAffected1);

        
         String sql2 = "INSERT INTO emp (empno, ename, job, sal, deptno) VALUES (?, ?, ?, ?, ?)";//empno but table has empid
         preStatement = connection.prepareStatement(sql2);
         preStatement.setInt(1, 9999);
         preStatement.setString(2, "NEW_EMP");
         preStatement.setString(3, "CLERK");
         preStatement.setDouble(4, 1500.00);
         preStatement.setInt(5, 10);
         int rowsAffected2 = preStatement.executeUpdate();
         System.out.println("Rows affected by second query: " + rowsAffected2);

        
         connection.commit();
         System.out.println("Transaction committed successfully.");

     } catch(SQLException e) {
 
         try {
                 connection.rollback();
                 System.out.println("Transaction rolled back.");

         } catch (SQLException ex) {
             ex.printStackTrace();
         }
         e.printStackTrace();
     }
	}

	
	public void getMetaDataAboutDataBase() {
	
		 DatabaseMetaData dbMetaData;
		try {
			dbMetaData = connection.getMetaData();
			 System.out.println("Database Product Name: " + dbMetaData.getDatabaseProductName());
	         System.out.println("Database Product Version: " + dbMetaData.getDatabaseProductVersion());
	         System.out.println("Driver Name: " + dbMetaData.getDriverName());
	         System.out.println("Driver Version: " + dbMetaData.getDriverVersion());
	         
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	}
	
	public void getMetaDataAboutEmpTable() {
	
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM emp");
			 ResultSetMetaData rsMetaData = resultSet.getMetaData();
	            int columnCount = rsMetaData.getColumnCount();
	            System.out.println("Number of columns: " + columnCount);
	            for (int i = 1; i <= columnCount; i++) {
	                System.out.println("Column " + i + ": " + rsMetaData.getColumnName(i) + " - " + rsMetaData.getColumnTypeName(i));
	            }  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
	}
	
	public void getMetaDataAboutDeptTable() {
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM dept");
			 ResultSetMetaData rsMetaData = resultSet.getMetaData();
	            int columnCount = rsMetaData.getColumnCount();
	            System.out.println("Number of columns: " + columnCount);
	            for (int i = 1; i <= columnCount; i++) {
	                System.out.println("Column " + i + ": " + rsMetaData.getColumnName(i) + " - " + rsMetaData.getColumnTypeName(i));
	            }  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
	}
}
