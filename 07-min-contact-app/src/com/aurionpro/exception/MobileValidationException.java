package com.aurionpro.exception;

public class MobileValidationException  extends RuntimeException {
	public String getMessage() {
		return "Enter Valid Mobile No!";
	}
}
