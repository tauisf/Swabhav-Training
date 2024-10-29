package com.aurionpro.test;


import java.util.Scanner;

import com.aurionpro.model.BankAccount;
import com.aurionpro.model.CurrentAccount;

import com.aurionpro.model.SavingAccount;

public class BankApp {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("Enter the Balance amount: ");
//		int balance = scanner.nextInt();
//		System.out.print("Enter the  AccountNo: ");
//		int accountNo = scanner.nextInt();
//	
//		System.out.print("Enter the name: ");
//		String name = scanner.next();
		BankAccount bankAccount = new SavingAccount(101, 10000,"MohdTausif" );
		
		System.out.print("Enter the deposit amount: ");
		int deposit = scanner.nextInt();
		
		bankAccount.deposite(deposit);
		
		System.out.print("Enter the withdraw amount: ");
		int withdraw = scanner.nextInt();
		
		bankAccount.withdraw(withdraw);
		
		 BankAccount currentAccount = new SavingAccount(101, 10000,"MohdTausif" );
		
		
		
		
		
		

	}

}
