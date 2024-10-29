package com.aurionpro.test;

import java.util.*;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		
		List<Account> users =new ArrayList<>();
		
		users.add(new Account(101,100,"Zaid"));
		users.add(new Account(101,1000,"Ashish"));
		users.add(new Account(101,10000,"Rehan"));
		users.add(new Account(101,10032,"Atul"));
		
		
	
		
		System.out.println("Account with minimun balance ");
		Optional<Account> min	= users.stream().min((user1, user2)->Double.compare(user1.getBalance(), user2.getBalance()) );
		System.out.println(min.get()+"\n");
		
		
		System.out.println("Account with maximum balance ");
		Optional<Account> max	= users.stream().max((user1, user2)->Double.compare(user1.getBalance(), user2.getBalance()) );
		System.out.println(max.get()+"\n");
		
		System.out.println("Name of the account which have less than 6 or equal to 6 char name");
		List<Account> lesser =users.stream().filter((user)-> user.getName().length() >=6).collect(Collectors.toList());
		System.out.println(lesser+"\n");
	
		System.out.println("Sum of the balance of all account");
		double sum	= users.stream().mapToDouble(user->user.getBalance()).sum();
		System.out.println(sum+"\n");
	}

}
