package com.aurionpro.test;

import com.aurionpro.exceptions.NotValidEmailException;
import com.aurionpro.exceptions.NotValidPasswordException;
import com.aurionpro.model.User;

public class UserApp {
	public static void main(String[] args) {
		
		try {
			User user1 = new User("siddiqui@gmail.com","Tausif@al20");
			System.out.println(user1);
		}catch(NotValidEmailException exception) {
			System.out.println(exception.getMessage());
		}catch(NotValidPasswordException exception) {
			System.out.println(exception.getMessage());
		}catch(Exception exception) {
			System.out.println("Something went wrong !!");
		}
		
	}
}
