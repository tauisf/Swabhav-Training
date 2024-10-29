package com.aurionpro.state.model;

public class OutOfStockState  implements VendingMachineState{

	@Override
	public void handleRequest(VendingMachineContext context) {
		System.out.println("Out of stock state: Product unavailable. Please select another product.");
		 context.setState(new ProductSelectedState());
	}

}
