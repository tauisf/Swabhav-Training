package com.aurionpro.model;

public abstract class Employee {
	  private String name; 
	    private int employeeId; 
	    private double basicSalary; 
	 
	    public Employee(String name, int employeeId, double basicSalary) { 
	        this.name = name; 
	        this.employeeId = employeeId; 
	        this.basicSalary = basicSalary; 
	    } 
	 
	     
	    public abstract double calculateSalary(); 
	    
	    public abstract double calculateBonus(); 
	 
	    public abstract void displayDetails();
	    public void setName(String name) { 
	  this.name = name; 
	 } 
	 
	 
	 public void setEmployeeId(int employeeId) { 
	  this.employeeId = employeeId; 
	 } 
	 
	 
	 public void setBasicSalary(double basicSalary) { 
	  this.basicSalary = basicSalary; 
	 } 
	 
	 
	 public String getName() { 
	        return name; 
	    } 
	 
	    public int getEmployeeId() { 
	        return employeeId; 
	    } 
	 
	    public double getBasicSalary() { 
	        return basicSalary; 
	    } 
	}

