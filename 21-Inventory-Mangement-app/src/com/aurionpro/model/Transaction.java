package com.aurionpro.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Random;

public class Transaction implements Serializable{
	 private static   Random random = new Random();
	   private int transactionId; 
	    private int productId;      
	    private String type;       
	    private int quantity;       
	    private LocalDateTime date;

	  
	    public Transaction( int productId, String type, int quantity) {
	        this.transactionId = random.nextInt(100)+1;
	        this.productId = productId;
	        this.type = type;
	        this.quantity = quantity;
	        this.date = LocalDateTime.now(); 
	    }

	   
	    public int getTransactionId() {
	        return transactionId;
	    }

	    public int getProductId() {
	        return productId;
	    }

	    public String getType() {
	        return type;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public LocalDateTime getDate() {
	        return date;
	    }

	    @Override
	    public String toString() {
	        return "Transaction{" +
	                "transactionId=" + transactionId +
	                ", productId=" + productId +
	                ", type='" + type + '\'' +
	                ", quantity=" + quantity +
	                ", date=" + date +
	                '}';
	    }
	}

