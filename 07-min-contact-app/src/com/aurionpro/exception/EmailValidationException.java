package com.aurionpro.exception;

public class EmailValidationException extends RuntimeException {
	public String getMessage() {
		return "Enter Valid Email!";
	}
}
