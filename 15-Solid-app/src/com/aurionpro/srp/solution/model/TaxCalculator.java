package com.aurionpro.srp.solution.model;

public class TaxCalculator {

	
public double calculateTax(Invoice invoice) {
		
		 return invoice.getAmount() * invoice.getTaxPrecentage();
		
	}
}
