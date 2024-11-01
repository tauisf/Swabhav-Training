package com.aurionpro.model;

public class PorductFactory {
 
	
	public  static Product createProduct(int id, String name, double price, int quantity ) {
	  return new Product(id, name, price, quantity);
  }
}
