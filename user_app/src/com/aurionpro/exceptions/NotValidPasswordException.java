package com.aurionpro.exceptions;

public class NotValidPasswordException extends RuntimeException{
	public String getMessage() {
		return "Enter Valid Password!";
	}
}
