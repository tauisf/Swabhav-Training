package com.aurionpro.facade.accountmodel;

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
		System.out.println("The balance "+creditbalance+" add to your bank");
		System.out.println("Current balance is :"+balance);
		
	}

	@Override
	public void debit(double debitAmt) {
		balance -=debitAmt;
		System.out.println("The balance "+debitAmt+"  debit from  your bank");
		System.out.println("Current balance is :"+balance);
	}

	public void overdraftAmt(double overdraft) {
		 if (balance <= overdraft) {
	            balance -= overdraft;
	            System.out.println("Overdraft of " + overdraft + " applied to Current Account. New Balance: " + balance);
	        } else {
	            System.out.println("Overdraft amount exceeds the limit.");
	        }
	}

	@Override
	public String toString() {
		return "CurrentAccount [id=" + id + ", name=" + name + "]";
	}
	
	

}
