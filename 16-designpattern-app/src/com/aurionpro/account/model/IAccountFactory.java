package com.aurionpro.account.model;

public interface IAccountFactory {

	public IAccount createAccount(int id , String name,double balance);
	
}
