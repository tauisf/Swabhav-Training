package com.aurionpro.facade.accountmodel;

public class CreateCurrentAccount implements IAccountFactory{

	@Override
	public IAccount createAccount(int id , String name,double balance) {
		IAccount account = new CurrentAccount(id,name,balance ,10000);
		return account;
	}

}
