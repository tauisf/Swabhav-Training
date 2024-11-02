package com.aurionpro.exception;

public class InventoryException extends RuntimeException{
	public String getMessage() {
		return "Product not found ";
	}
}


