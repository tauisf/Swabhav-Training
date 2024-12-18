package com.aurionpro.facade.accountmodel;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
	private Map<Integer, IAccount> accounts = new HashMap<>();

	public void createSavingAccount(int id, String name, double balance) {
		IAccountFactory factory = new CreateSavingAccount();
		IAccount savingAccount = factory.createAccount(id, name, balance);
		accounts.put(id, savingAccount);

		System.out.println("Saving Account created  successfully");
	}

	public void createCurrentAccount(int id, String name, double balance) {
		IAccountFactory factory = new CreateSavingAccount();
		IAccount currentAccount = factory.createAccount(id, name, balance);
		accounts.put(id, currentAccount);
		System.out.println("Current Account created  successfully");
	}

	public void credit(int accountId, double creditAmt) {
		IAccount account = accounts.get(accountId);

		if (account != null) {
			account.credit(creditAmt);
			return;
		}
		System.out.println("Account not found");

	}

	public void debit(int accountId, double debitAmt) {
		IAccount account = accounts.get(accountId);
		if (account != null) {
			account.debit(debitAmt);
			return;
		}
		System.out.println("Account not found");

	}

	public void applyOverdraft(int accountId, double amount) {
		IAccount account = accounts.get(accountId);
		if (account instanceof CurrentAccount) {
			((CurrentAccount) account).overdraftAmt(amount);
			return;
		}
		System.out.println("Overdraft can only be applied to Current Accounts.");

	}
}
