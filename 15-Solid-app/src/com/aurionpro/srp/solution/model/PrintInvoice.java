package com.aurionpro.srp.solution.model;

public class PrintInvoice {

	
	public void printInvoice(Invoice invoice, TaxCalculator tax) {
		
		System.out.println(	"Id :"+invoice.getId()
							+"\nName: "+invoice.getName()
							+"\nAmount: "+invoice.getAmount()
							+"\nTax to pay: "+tax.calculateTax(invoice));
		
	}
}

