package com.aurionpro.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentsDB {

	Scanner scanner = new Scanner(System.in);
	private Connection connection = null;
	private Statement statement = null;
	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student24db", "root", "1234");
		 
		 System.out.println("Connection Successfull");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void getStudents() {
		try {
			statement = connection.createStatement();
			
		ResultSet resultset = statement.executeQuery("select * from students");
		
		System.out.println("Rollno \t Name \t Age \t Precentage");
		while(resultset.next()) {
			System.out.println(resultset.getInt(1)+" \t "+resultset.getString("name")
			+" \t "+resultset.getInt(3)+" \t "+resultset.getDouble("percentage"));
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addStudent() {
		try {
			 PreparedStatement  statement = connection.prepareStatement("Insert into students values(?,?,?,?)");
			
			System.out.print("Enter the roll no of the student :");
			int rollno  = scanner.nextInt();
			
			System.out.print("Enter the name of the student :");
			String name  = scanner.next();
			
			System.out.print("Enter the age of the student :");
			int age  = scanner.nextInt();
			
			System.out.print("Enter the percentage of the student :");
			double percentage  = scanner.nextDouble();
			
			statement.setInt(1, rollno);
			statement.setString(2, name);
			statement.setInt(3, age);
			statement.setDouble(4, percentage);
			statement.execute();
			
			System.out.println("Record added Successfully");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void upadateStudent() {
		 try {
			System.out.print("Enter percentage to be upadate  by :");
			Double prec  = scanner.nextDouble();
			PreparedStatement  statement = connection.prepareStatement("update students set percentage = percentage + ?");
			statement.setDouble(1, prec);
			statement.execute();
			System.out.println("Students percentage ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteStudent() {
		try {
			System.out.print("Enter rollno to delete :");
			int rollno  = scanner.nextInt();
			PreparedStatement  statement = connection.prepareStatement("delete from  students where rollno = ? ;");
			statement.setInt(1,rollno );
			statement.execute();
			System.out.println("Record is deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
