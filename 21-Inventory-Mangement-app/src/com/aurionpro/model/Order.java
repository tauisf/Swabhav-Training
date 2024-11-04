package com.aurionpro.model;


import java.util.List;
import java.util.Random;

public class Order {
	
	Random random = new Random();
	
	 private int orderId;
	 private  int supplierId ;
	 private List<Product> products;
	 
	 
	    
	    
	    public Order(int supplierId,List<Product> products) {
	        this.orderId = random.nextInt(100)+1;
	        this.supplierId = supplierId;
	        this.products = products ;
	    }

	    public int getOrderId() {
	        return orderId;
	    }

	    public int getCustomerId() {
	        return supplierId;
	    }

		public List<Product> getProducts() {
			return products;
		}

		@Override
		public String toString() {
			return "Order [random=" + random + ", orderId=" + orderId + ", supplierId=" + supplierId + ", products="
					+ products + "]";
		}

	  
	    
	   
	}
