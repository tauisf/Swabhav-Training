package com.aurionpro.state.model;

public class ProductSelectedState implements VendingMachineState {

	@Override
	public void handleRequest(VendingMachineContext context) {
		 System.out.println("Product selected state: Processing payment.");
		 context.setState(new PaymentPendingState());
		
	}
	

}
