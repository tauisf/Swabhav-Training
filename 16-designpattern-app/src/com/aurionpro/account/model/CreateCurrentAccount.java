package com.aurionpro.account.model;

public class CreateCurrentAccount implements IAccountFactory{

	@Override
	public IAccount createAccount(int id , String name,double balance) {
		IAccount account = new CurrentAccount(id,name,balance ,10000);
		return account;
	}

}
