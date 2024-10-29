package com.aurionpro.models;


import java.util.Random;
import java.util.Scanner;

public class Account {
	Scanner scanner = new Scanner(System.in);
	Random random =  new Random();
	
		private int accountNumber;
		private int balance ;
		private String name;
		private boolean userExisted = false;
		
		// Getter and Setter 
		public int getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		// Methods 
		 public void resetAccount() {
		        this.balance = 0; 
		        this.name = "";
		        this.accountNumber = 0;
		        this.userExisted = false; 
		    }
		public void createAccount() {
			
			 if (userExisted) {
			        System.out.println("Do you want to create a new account? (y/n)");
			        String response = scanner.next().toLowerCase();
			        scanner.nextLine(); 
			        if (response.equals("y")) {
			            resetAccount(); 
			        } else {
			            return; 
			        }
			    }

			    System.out.println("Enter your name:");
			    String userName = scanner.nextLine(); 
			    setName(userName);

			    int accountNo = random.nextInt(100) + 1; 
			    setAccountNumber(accountNo);
			    userExisted = true;

			    System.out.println("Your account is created.");
			    System.out.println("Your account name is: " + getName());
			    System.out.println("Your account number is: " + getAccountNumber());
			}
		
		
		public void showBalance() {
			System.out.println("Your current balance is : "+getBalance());
		}
		
		public void deposite() {
			System.out.print("Enter the desposite amount:  ");
			int deposit = scanner.nextInt();
			
			setBalance(getBalance()+deposit);
			System.out.println("Your current balance is : "+getBalance());
		}
		
		
		public void withdarw() {
			System.out.print("Enter the withdarwal amount:  ");
			int withdraw = scanner.nextInt();
				if(getBalance() > withdraw) {
					
					if(( getBalance() - withdraw) > 500) {
						setBalance(getBalance()- withdraw);
						System.out.println(" your current balance is : "+getBalance());
					}else {
						System.out.println("There should be minimum amount of 500 ");
					}
					
				}else {
					System.out.println("You dont have sufficient balance for withdarwal");
					System.out.println(" Your current balance is : "+getBalance());
				}
				
		}
		
		
			
			

	}


