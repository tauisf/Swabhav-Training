package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.ContractEmployee;
import com.aurionpro.model.Employee;
import com.aurionpro.model.Intern;
import com.aurionpro.model.PermanentEmployee;
public class EmployeeManagementSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Employee employee = null;
        boolean exit = false;

        while (!exit) {
            // Print menu
            System.out.println("\n=================================");
            System.out.println("   Employee Management System");
            System.out.println("=================================");
            System.out.println("1. Add Permanent Employee");
            System.out.println("2. Add Contract Employee");
            System.out.println("3. Add Intern");
            System.out.println("4. Show Employee Details");
            System.out.println("5. Calculate Salary");
            System.out.println("6. Calculate Bonus");
            System.out.println("7. Exit");
            System.out.println("=================================");
            System.out.print("Choose an option (1-7): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.println("\n-- Add Permanent Employee --");
                    System.out.print("Enter Name: ");
                    String pName = scanner.nextLine();
                    System.out.print("Enter Employee ID: ");
                    int pId = scanner.nextInt();
                    System.out.print("Enter Basic Salary: ");
                    double pBasicSalary = scanner.nextDouble();
                    System.out.print("Enter HRA: ");
                    double hra = scanner.nextDouble();
                    employee = new PermanentEmployee(pName, pId, pBasicSalary, hra);
                    System.out.println("Permanent Employee added successfully.");
                    break;
                case 2:
                    System.out.println("\n-- Add Contract Employee --");
                    System.out.print("Enter Name: ");
                    String contractName = scanner.nextLine();
                    System.out.print("Enter Employee ID: ");
                    int contractId = scanner.nextInt();
                    System.out.print("Enter Basic Salary: ");
                    double contractBasicSalary = scanner.nextDouble();
                    System.out.print("Enter Contract Duration (months): ");
                    int contractDuration = scanner.nextInt();
                    System.out.print("Enter Contract Rate per Month: ");
                    double contractRate = scanner.nextDouble();
                    employee = new ContractEmployee(contractName, contractId, contractBasicSalary, contractDuration, contractRate);
                    System.out.println("Contract Employee added successfully.");
                    break;
                case 3:
                    System.out.println("\n-- Add Intern --");
                    System.out.print("Enter Name: ");
                    String internName = scanner.nextLine();
                    System.out.print("Enter Employee ID: ");
                    int internId = scanner.nextInt();
                    System.out.print("Enter Basic Salary: ");
                    double internBasicSalary = scanner.nextDouble();
                    System.out.print("Enter Stipend: ");
                    double stipend = scanner.nextDouble();
                    employee = new Intern(internName, internId, internBasicSalary, stipend);
                    System.out.println("Intern added successfully.");
                    break;
                case 4:
                    System.out.println("\n-- Show Employee Details --");
                    if (employee != null) {
                        employee.displayDetails();
                    } else {
                        System.out.println("No employee found. Please add an employee first.");
                    }
                    break;
                case 5:
                    System.out.println("\n-- Calculate Salary --");
                    if (employee != null) {
                        System.out.println("Calculated Salary: " + employee.calculateSalary());
                    } else {
                        System.out.println("No employee found. Please add an employee first.");
                    }
                    break;
                case 6:
                    System.out.println("\n-- Calculate Bonus --");
                    if (employee != null) {
                        System.out.println("Calculated Bonus: " + employee.calculateBonus());
                    } else {
                        System.out.println("No employee found. Please add an employee first.");
                    }
                    break;
                case 7:
                    System.out.println("\nThank you for using the Employee Management System. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
