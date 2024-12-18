package com.aurionpro.account.model;

public class CurrentAccount implements IAccount  {
	private int id ;
	private String name;
	private double balance;
	private double overdraft;
	
	
	public CurrentAccount(int id, String name, double balance, double overdraft) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.overdraft =overdraft;
	}


	@Override
	public void credit(double creditbalance) {
		balance +=creditbalance;
		System.out.println("The balance "+creditbalance+"add to your bank");
		System.out.println("Current balance is :"+balance);
		
	}

	@Override
	public void debit(double debitAmt) {
		balance -=debitAmt;
		System.out.println("The balance "+debitAmt+"add to your bank");
		System.out.println("Current balance is :"+balance);
	}

	public void overdraftAmt(double overdraft) {
	    System.out.println("the overdrsft amount "+overdraft);
	}

	@Override
	public String toString() {
		return "CurrentAccount [id=" + id + ", name=" + name + "]";
	}
	
	

}
