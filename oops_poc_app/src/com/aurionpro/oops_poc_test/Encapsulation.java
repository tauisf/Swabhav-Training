package com.aurionpro.oops_poc_test;
import java.util.Random;
import java.util.Scanner;

import com.aurionpro.poc_oop_model.Employee;

public class Encapsulation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		Random random =  new Random();
		
		Employee emp1 = new Employee();
		
		System.out.println("Enter the Employee name: ");
		String Name = scanner.nextLine();
		emp1.setEmpName(Name);
		
		
		int Id = random.nextInt(100)+100;
		emp1.setEmpId(Id);
		
		System.out.println("The Employee name is: "+emp1.getEmpName());
		System.out.println("The Employee Id is: "+emp1.getEmpId());
	}
}
