package com.aurionpro.model;

public class Intern extends Employee {
	private double stipend; 
	 
    public Intern(String name, int employeeId, double basicSalary, double stipend) { 
        super(name, employeeId, basicSalary); 
        this.stipend = stipend; 
    } 
 
    @Override 
    public double calculateSalary() { 
        return getBasicSalary() + stipend; 
    } 
 
    @Override 
    public double calculateBonus() { 
        return 0; 
    }
    public void displayDetails() {
        System.out.println("\nEmployee Type: Intern ");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getEmployeeId());
        System.out.println("Basic Salary: " + getBasicSalary());
        System.out.println("Stipend: " + stipend);
    }
}
