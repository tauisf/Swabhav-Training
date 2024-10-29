package com.aurionpro.exceptions;

public class NegativeAmountException extends RuntimeException {
	public String getMessage() {
		return "The amount cannot be negative";
	}
}
