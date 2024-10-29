package com.aurionpro.exception;

public class AgeNotValidException extends RuntimeException {
	private int age;
	
	

	public AgeNotValidException(int age) {
		super();
		this.age = age;
	}

	
	public String getMessage() {
		return "Your age is " +age+ " is not valid :Enter age above 18";
	}
}
