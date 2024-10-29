package com.aurionpro.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int accountNo;
	private String name;
	private double balance;
	private String msg;
	private double amount;
	private List<INotifier> notifiers;
	
	
	public Account(int accountNo, String name, double balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		
		this.notifiers = new ArrayList<>();
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	public List<INotifier> getNotifiers() {
		return notifiers;
	}
	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}
	public void  credit(double amount) {
		this.amount =  amount;
		setBalance(getBalance()+amount);
		setMsg("Your Account is credit by ");

	}
	
	public void debit(double amount) {
		
		if(getBalance() > amount) {
			this.amount =  amount;
			setBalance(getBalance()-amount);
			setMsg("Your Account is debit by ");
			return;
		}
		setMsg("In sufficient balance: ");
		
	}
	
	public void addNotifier(INotifier notify) {
		notifiers.add(notify);
	}
	
	public void display() {
		for(INotifier notofier :notifiers )
			notofier.getNotification(this, amount, msg);
	}
	
	
	
}
