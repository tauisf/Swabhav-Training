package com.aurionpro.model;

public class ContractEmployee extends Employee {
	 private int contractDuration;  
	    private double contractRate;   
	 
	    public ContractEmployee(String name, int employeeId, double basicSalary, int contractDuration, double contractRate) { 
	        super(name, employeeId, basicSalary); 
	        this.contractDuration = contractDuration; 
	        this.contractRate = contractRate; 
	    } 
	 
	    @Override 
	    public double calculateSalary() { 
	        return contractDuration * contractRate; 
	    } 
	 
	    @Override 
	    public double calculateBonus() { 
	        return 0; 
	    } 
	    public void displayDetails() {
	        System.out.println("\nEmployee Type: Contract Employee");
	        System.out.println("Name: " + getName());
	        System.out.println("ID: " + getEmployeeId());
	        System.out.println("Basic Salary: " + getBasicSalary());
	        System.out.println("contractDuration: " + contractDuration);
	        System.out.println("Contract Rate: " + contractRate);
	        
	    }
}
