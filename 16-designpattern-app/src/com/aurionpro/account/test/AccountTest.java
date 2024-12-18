package com.aurionpro.account.test;

import com.aurionpro.account.model.CreateCurrentAccount;
import com.aurionpro.account.model.CreateSavingAccount;
import com.aurionpro.account.model.IAccount;
import com.aurionpro.account.model.IAccountFactory;

public class AccountTest {
	 public static void main(String[] args ) {
		 
		 IAccountFactory factory = new CreateSavingAccount();
		 
		 IAccount  account = factory.createAccount(100, "Tausif",1000);
		 
		 System.out.println(account);
		 account.credit(1000);
		 account.debit(200);
		 
		 factory = new CreateCurrentAccount();
		 account = factory.createAccount(301, "faiz",1000);
		 
		 System.out.println(account);
		 account.credit(10110);
		 account.debit(2050);
	 }
}
