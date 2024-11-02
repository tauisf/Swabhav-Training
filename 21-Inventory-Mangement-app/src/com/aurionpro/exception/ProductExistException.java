package com.aurionpro.exception;

import com.aurionpro.model.Product;

public class ProductExistException extends RuntimeException {
	private int id ;
	
	public ProductExistException(int id) {
		super();
		this.id = id;
	}

	public String getMessage() {
		return "Product already Exist with  id: "+id;
	}
}


