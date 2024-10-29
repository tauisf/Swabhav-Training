package com.aurionpro.assignment;

import java.util.Scanner;

public class SimpleAtmSimulation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int currentBalance = 1000;
		int deposit = 0;
		int withdraw =0;
		boolean exit = true;
		while(exit) {
			System.out.println("ATM Menu:\r\n"
					+ "1. Check Balance\r\n"
					+ "2. Deposit Money\r\n"
					+ "3. Withdraw Money\r\n"
					+ "4. Exit");
			
			System.out.println("Please choose an option: ");
			int choice = scanner.nextInt();
			
			switch(choice) {
			
			case 1: System.out.println("Your current balance is: "+currentBalance);
					break;
			
			case 2: System.out.println("Enter the amount  to deposit: ");
					deposit = scanner.nextInt();
					currentBalance += deposit;
					System.out.println("You have deposited  "+deposit+". Your new balance is "+currentBalance);
					break;
					
			case 3: System.out.println("Enter the amount  to Withdraw: ");
					withdraw = scanner.nextInt();
					currentBalance -= withdraw;
					System.out.println("You have  Withdraw "+withdraw+". Your new balance is "+currentBalance);
					break;
					
			case 4: System.out.println("Thankyou for banking with us !! ");
					exit = false;
					break;
					
			 default: System.out.println("invalid Option ");

			
			}
			
		}

	}

}
