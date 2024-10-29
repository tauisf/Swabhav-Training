package com.aurionpro.model;

public class SavingAccount extends BankAccount  {
	private double amount ;


	
	public SavingAccount(int accountNo, int balance, String name) {
		super(accountNo, balance, name);
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public void  deposite(int amount) { 	
		setAmount(amount);
		setBalance(getBalance()+getAmount());
		System.out.println("Your Account balance is: "+getBalance());
		
	}

	@Override
	public void withdraw(int amount) {
		setAmount(amount);
		setBalance(getBalance()-getAmount());
		System.out.println("Your Account balance is: "+getBalance());
		
	}

}