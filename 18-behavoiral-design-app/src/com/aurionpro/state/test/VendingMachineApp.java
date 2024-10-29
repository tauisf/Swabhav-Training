package com.aurionpro.state.test;

import com.aurionpro.state.model.VendingMachineContext;

public class VendingMachineApp {
	public static void main(String[] args) {
		
		VendingMachineContext machine = new VendingMachineContext();
		machine.request();
		machine.request();
		machine.request();
	}
}
