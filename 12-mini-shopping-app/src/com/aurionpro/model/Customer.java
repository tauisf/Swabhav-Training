package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
		
	private int customerId;
	private String name;
	private long mobileNo;
	private List<Order> orders;
	
	public Customer(int customerId, String name, long mobileNo) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.mobileNo = mobileNo;
		this.orders = new ArrayList<>();
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
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
		return "Customer [customerId=" + customerId + ", name=" + name + ", mobileNo=" + mobileNo + ", orders=" + orders
				+ "]";
	}

	
	
	
	
}
