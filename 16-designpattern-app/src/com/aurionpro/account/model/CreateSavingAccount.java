package com.aurionpro.account.model;

public class CreateSavingAccount implements IAccountFactory {

	@Override
	public IAccount createAccount(int id , String name,double balance) {
		IAccount account = new SavingAccount(id , name,balance);
		return account;
	}

}