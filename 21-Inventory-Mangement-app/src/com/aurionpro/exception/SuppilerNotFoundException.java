package com.aurionpro.exception;

public class SuppilerNotFoundException extends RuntimeException{

	public String getMessage() {
		return "-----Supplier Not Found " ;
	}
}
