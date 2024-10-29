package com.aurionpro.observer.model;

public class EmailNotifier implements INotifier{

	@Override
	public void getNotification(Account account, double amount, String msg) {
		System.out.println("---Email---");
		System.out.println(msg+amount);
		System.out.println("Your total balance is: "+account.getBalance());
		
	}

}
