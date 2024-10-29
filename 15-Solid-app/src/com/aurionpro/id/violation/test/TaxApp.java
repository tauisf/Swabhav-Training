package com.aurionpro.id.violation.test;

import com.aurionpro.id.violation.model.TaxCalculator;

public class TaxApp {

	public static void main(String[] args) {
		TaxCalculator taxCal = new TaxCalculator();
		
		taxCal.calculateTax(1000, 10);
	}

}
