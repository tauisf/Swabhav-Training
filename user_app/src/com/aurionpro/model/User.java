package com.aurionpro.model;
import java.util.regex.*;

import com.aurionpro.exceptions.NotValidEmailException;
import com.aurionpro.exceptions.NotValidPasswordException;

public class User {

	private String email;
	private String password;
	
	
	
	public User(String email, String password) {
		super();
	
		if(isValidEmail(email) == false)
			throw new NotValidEmailException();
		this.email = email;
		if(isValidPassword(password) == false)
			throw new NotValidPasswordException();
		this.password = password;
	}



	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}



	public static boolean isValidPassword(String password) {
		 String regex = "^(?=.*[0-9])"
                 + "(?=.*[a-z])(?=.*[A-Z])"
                 + "(?=.*[@#$%^&+=])"
                 + "(?=\\S+$).{8,20}$";
		 Pattern p = Pattern.compile(regex);
		 if (password == null) {
	            return false;
	        }
		 Matcher m = p.matcher(password);
		 return m.matches();
		 
	}
	  public static boolean isValidEmail(String email) {
		 String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                 "[a-zA-Z0-9_+&*-]+)*@" + 
                 "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                 "A-Z]{2,7}$"; 
                   
					Pattern pat = Pattern.compile(emailRegex); 
					if (email == null) 
					 return false; 
					return pat.matcher(email).matches(); 
		 
	}
}
