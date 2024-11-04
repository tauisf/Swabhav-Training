package com.aurionpro.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Suppiler implements Serializable {
	 private int supplierId;
	    private String name;
	    private String contactInfo;
	    private List<Order> orders;

	    public Suppiler(int supplierId, String name, String contactInfo) {
	        this.supplierId = supplierId;
	        this.name = name;
	        this.contactInfo = contactInfo;
	        this.orders = new ArrayList<>();
	    }

	    public int getSupplierId() {
	        return supplierId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getContactInfo() {
	        return contactInfo;
	    }

	    public void setContactInfo(String contactInfo) {
	        this.contactInfo = contactInfo;
	    }

	    
	    public List<Order> getOrders() {
			return orders;
		}

		public void setOrders(List<Order> orders) {
			this.orders = orders;
		}

		public void addOrder(Order order) {
			orders.add(order);
		}
		@Override
	    public String toString() {
	        return "Supplier ID: " + supplierId + ", Name: " + name + ", Contact Info: " + contactInfo;
	    }
}
