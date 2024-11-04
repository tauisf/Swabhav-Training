package com.aurionpro.exception;

public class NotFoundException extends RuntimeException {

	public String getMessage() {
		return "Not Found: ";
	}
}
