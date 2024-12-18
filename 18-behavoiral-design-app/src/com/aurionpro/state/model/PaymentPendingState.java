package com.aurionpro.state.model;

public class PaymentPendingState implements VendingMachineState{

	@Override
	public void handleRequest(VendingMachineContext context) {
		System.out.println("Payment pending state: Dispensing product.");
		 context.setState(new OutOfStockState());
	}

}
