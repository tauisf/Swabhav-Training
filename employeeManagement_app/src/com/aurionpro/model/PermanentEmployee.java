package com.aurionpro.model;

public class PermanentEmployee extends Employee {
	 private double hra; 
	 
	    public PermanentEmployee(String name, int employeeId, double basicSalary, double hra) { 
	        super(name, employeeId, basicSalary); 
	        this.hra = hra; 
	    } 
	 
	    @Override 
	    public double calculateSalary() { 
	        return getBasicSalary() + hra ; 
	    } 
	 
	    @Override 
	    public double calculateBonus() { 
	        return getBasicSalary() * 0.10;  
	    } 
	    
	    @Override
	    public void displayDetails() {
	        System.out.println("\nEmployee Type: Permanent Employee");
	        System.out.println("Name: " + getName());
	        System.out.println("ID: " + getEmployeeId());
	        System.out.println("Basic Salary: " + getBasicSalary());
	        System.out.println("HRA: " + hra);
	    }
	}

	
