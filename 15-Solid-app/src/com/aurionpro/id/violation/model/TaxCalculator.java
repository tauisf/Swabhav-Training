package com.aurionpro.id.violation.model;

public class TaxCalculator {

	
	private Dblobgger logger ;
	
	
	public TaxCalculator() {
		super();
		this.logger = new Dblobgger();
	}


	public  void calculateTax(int amount , int rate) {
		int tax =0;
		try {
			tax =  amount /rate ;
			System.out.println("Tax log to system is "+tax );
		}catch(Exception exception){
			logger.log("Divide by zero");
			
		}
		
	}
}
