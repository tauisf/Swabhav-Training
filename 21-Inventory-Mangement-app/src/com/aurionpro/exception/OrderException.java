package com.aurionpro.exception;

public class OrderException extends Exception {
    public String getMessage() {
    	return "Something Worng : Order didn't placed ";
    }
}
