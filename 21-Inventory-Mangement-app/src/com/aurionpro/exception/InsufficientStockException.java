package com.aurionpro.exception;

public class InsufficientStockException extends RuntimeException {

	public String getMessage() {
		return "Insufficient stock : Cannot Remove the Products";
	}
}
