package com.aurionpro.exception;

public class NegativeException extends RuntimeException{
	public String getMessage() {
		return "Negative Quantity : Please enter positive qauntity ";
	}
}


