package com.aurionpro.model;

public  abstract class BankAccount implements ITransactions {
 
	 private int accountNo;
	 private double balance ;
	 private String name;
	 
	 
	public BankAccount(int accountNo, int balance, String name) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double d) {
		this.balance = d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
