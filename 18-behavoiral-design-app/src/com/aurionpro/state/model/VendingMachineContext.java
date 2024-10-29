package com.aurionpro.state.model;

public class VendingMachineContext {

	private VendingMachineState state;

	public VendingMachineContext() {
		super();
		this.state = new ProductSelectedState();
	}

	public void setState(VendingMachineState state) {
		this.state = state;
	}

	 public void request() {
	        state.handleRequest(this);
	    }
	
	
	
}
