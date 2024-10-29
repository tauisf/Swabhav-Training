package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private int orderId;
	private List<LineItems> lineItems;
	private double total;
	private String date;
	
	public Order(int orderId, String date) {
		super();
		this.orderId = orderId;
		this.lineItems = new ArrayList<>();
		this.total = 0;
		this.date = date;
	}
	
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<LineItems> getLineItems() {
		return lineItems;
	}
	public void setLineItems(List<LineItems> lineItems) {
		this.lineItems = lineItems;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public void addLineItem(LineItems lineItem) {
		lineItems.add(lineItem);
	}
	
	 public double calculateTotal() {
	        total = 0.0;  
	        for (LineItems item : lineItems) {
	            total += item.getQuantity() * item.getProduct().getUnitPrice();
	        }
	        return total;
	    }



	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", lineItems=" + lineItems + ", total=" + total + ", date=" + date + "]";
	}
	 
}

