package com.aurionpro.exceptions;

public class MinimumAmountException extends RuntimeException{

	public String getMessage() {
		return "There should be a minimun Amount of 500";
	}
}
