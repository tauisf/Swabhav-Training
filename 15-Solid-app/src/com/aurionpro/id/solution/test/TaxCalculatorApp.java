package com.aurionpro.id.solution.test;

import com.aurionpro.id.solution.model.DbLogger;
import com.aurionpro.id.solution.model.FileLog;
import com.aurionpro.id.solution.model.TaxCalculatorSolution;

public class TaxCalculatorApp {

	public static void main(String[] args) {
		TaxCalculatorSolution calculator = new TaxCalculatorSolution(new DbLogger());
		calculator.calculateTax(1000, 0);
		 calculator = new TaxCalculatorSolution(new FileLog());
		 calculator.calculateTax(1000, 0);
	}

}
