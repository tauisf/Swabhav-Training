package com.aurionpro.srp.solution.model;

public class Invoice {
	private int Id;
	private String name ;
	private double amount;
	private double taxPrecentage;
	public Invoice(int id, String name, double amount, double taxPrecentage) {
		super();
		Id = id;
		this.name = name;
		this.amount = amount;
		this.taxPrecentage = taxPrecentage/100;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTaxPrecentage() {
		return taxPrecentage;
	}
	public void setTaxPrecentage(double taxPrecentage) {
		this.taxPrecentage = taxPrecentage;
	}
	
	
}
