package com.aurionpro.exceptions;

public class NotValidEmailException  extends RuntimeException{
		
	public String getMessage() {
		return "Enter Valid Email!";
	}
}
