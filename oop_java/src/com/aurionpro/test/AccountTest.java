package com.aurionpro.test;
import  com.aurionpro.models.Account;

import java.util.Scanner;

import com.aurionpro.models.Account;


public class AccountTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	
		boolean userCreated = false;
		boolean exit = true;
		
		
		 Account user = new Account();
		while(exit) {
			System.out.println("ATM Menu:\r\n"
					+ "1. Create Account\r\n"
					+ "2. Deposit Money\r\n"
					+ "3. Withdraw Money\r\n"
					+ "4. Check Balance\r\n"
					+ "5. Exit");
			
			
			System.out.print("Please choose an option: ");
			 int choice = scanner.nextInt();
			
			
					
					 switch(choice) {
						case 1:	
							user.createAccount();
								userCreated = true;
								break;
					
						case 2: if(userCreated) {
									user.deposite();
								}else {
									System.out.println("Please Create an account First!!");
								}
								break;
							
						case 3: if(userCreated) {
								user.withdarw();
								}else {
									System.out.println("Please Create an account First!!");
								}
								break;
						
						case 4: if(userCreated) {
									user.showBalance();
								}else {
									System.out.println("Please Create an account First!!");
								}
								break;
								
						
								
						case 5: System.out.println("Thankyou for banking with us !! ");
								exit = false;
								break;
								
						default: System.out.println("Invalid Choice!!");
				
				
							 }
					 
					 
					
			
		}

	}

}
