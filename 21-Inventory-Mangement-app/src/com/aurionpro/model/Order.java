package com.aurionpro.model;


import java.util.List;
import java.util.Random;

public class Order {
	Random random = new Random();
	 private int orderId;
	    private String customerId;
	    private List<Product> products;
	    public Order(String customerId,List<Product> products) {
	        this.orderId = random.nextInt(100)+1;
	        this.customerId = customerId;
	        this.products = products ;
	    }

	    public int getOrderId() {
	        return orderId;
	    }

	    public String getCustomerId() {
	        return customerId;
	    }

		public List<Product> getProducts() {
			return products;
		}

	  
	    
	   
	}
