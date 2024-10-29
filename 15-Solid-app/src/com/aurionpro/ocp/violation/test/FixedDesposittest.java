package com.aurionpro.ocp.violation.test;

import java.util.Scanner;

import com.aurionpro.ocp.violation.model.FixedDeposit;



public class FixedDesposittest {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the Account No : ");
		int accNo = scanner.nextInt();
		
		System.out.print("Enter the Name : ");
		String name = scanner.next();
		scanner.nextLine();
		System.out.print("Enter the  Principle Amount : ");
		double amount = scanner.nextDouble();

		System.out.print("Enter the duration : ");
		int duration = scanner.nextInt();
		
		System.out.println("Enter the festival offer  : 1.Dawali 2.Holi 3.Chirstmas 4.NewYear");
		int offer = scanner.nextInt();
		
		
		
		FixedDeposit fixedDeposit = new FixedDeposit(accNo,name,amount,duration,offer);
		fixedDeposit.calculateInterest();

		System.out.println(fixedDeposit);
	
	}

}
