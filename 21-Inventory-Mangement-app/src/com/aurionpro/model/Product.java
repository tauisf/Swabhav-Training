package com.aurionpro.model;

public class Product {
	
		private int id;
	    private String name;
	    private double price;
	    private int quantity;

	    public Product(int id, String name, double price, int quantity) {
	        if (quantity < 0) {
	            throw new IllegalArgumentException("Quantity cannot be negative.");
	        }
	        this.id = id;
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setId(int id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public void setQuantity(int quantity) {
	        if (quantity < 0) {
	            throw new IllegalArgumentException("Quantity cannot be negative.");
	        }
	        this.quantity = quantity;
	    }
	}


	

