package com.aurionpro.exceptions;

public class OverdraftLimitExceedException extends RuntimeException {

	public String getMethod() {
		return "Your overdraft limit exceeded";
	}
}
