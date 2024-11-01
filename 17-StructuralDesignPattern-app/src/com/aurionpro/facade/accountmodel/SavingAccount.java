package com.aurionpro.facade.accountmodel;

public class SavingAccount implements IAccount{
	private int id ;
	private String name;
	private double amount;
	

	public SavingAccount(int id, String name ,double amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	@Override
	public void credit(double creditAmount) {
		amount +=creditAmount;
		System.out.println("The amount "+creditAmount+" add to your bank");
		System.out.println("Current balance is :"+amount);
		
	}

	@Override
	public void debit(double debitAmt) {
		amount -=debitAmt;
		System.out.println("The balance "+debitAmt+"  debit from  your bank");
		System.out.println("Current balance is :"+amount);
	}

	@Override
	public String toString() {
		return "SavingAccount [id=" + id + ", name=" + name + "]";
	}
	
	

}
