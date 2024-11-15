package com.aurionpro.dbOrganisation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrganisationDB {
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preStatement = null;
	
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
	
	public void getEmpData() {
		try {
			statement = connection.createStatement();
			String query = "select * from emp ; ";
			ResultSet resultset =statement.executeQuery(query);
			
			System.out.println("empid \t ename \t job \t\t mgrid  \t hireDate \t salary \t "
					+ "Commision \t deptno");
			
			while(resultset.next()) {
				System.out.println(resultset.getInt(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3)+"\t\t"
				+resultset.getInt(4)+"\t"+resultset.getString(5)+"\t"+resultset.getDouble(6)+"\t"
				+resultset.getDouble(7)+"\t"+resultset.getInt(8));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void getDeptData() {
		try {
			statement = connection.createStatement();
			String query = "select * from dept ; ";
			ResultSet resultset =statement.executeQuery(query);
			
			System.out.println("deptno \t dname \t location");
			
			while(resultset.next()) {
				System.out.println(resultset.getInt(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void addDept() {
		try {
			preStatement = connection.prepareStatement("insert into dept values(?,?,?);");
			
			System.out.println("Enter department id");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void Query() {
		try {

			String tableName = "dept";
			String query = "select * from "+tableName;
			preStatement =  connection.prepareStatement(query);
			 ResultSet resultset = preStatement.executeQuery();
		        System.out.println("deptno \t dname \t location");
		        
		        while (resultset.next()) {
		            System.out.println(resultset.getInt(1) + "\t" + resultset.getString(2) + "\t" + resultset.getString(3));
		        }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
