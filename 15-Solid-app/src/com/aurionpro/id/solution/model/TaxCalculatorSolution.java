package com.aurionpro.id.solution.model;

public class TaxCalculatorSolution {

	private ILogger logger;
	
	public TaxCalculatorSolution(ILogger logger) {
		super();
		this.logger = logger;
		
	}



	public void calculateTax(int amount , int rate) {
		int tax =0;
		try {
			tax =  amount /rate ;
			System.out.println("Tax log to system is "+tax );
		}catch(Exception exception){
			logger.log();
		}
		
	}
	
}
