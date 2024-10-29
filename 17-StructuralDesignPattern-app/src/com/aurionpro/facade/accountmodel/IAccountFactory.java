package com.aurionpro.facade.accountmodel;

public interface IAccountFactory {

	public IAccount createAccount(int id , String name,double balance);
	
}
