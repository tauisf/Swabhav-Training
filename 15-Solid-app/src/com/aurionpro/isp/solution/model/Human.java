package com.aurionpro.isp.solution.model;

public class Human implements IHuman {

	@Override
	public void startWork() {
		System.out.println("Working ...");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Stop Working ...");
		
	}

	@Override
	public void eat() {
		System.out.println("Eating ...");
		
	}

	@Override
	public void drink() {
		System.out.println("Drink ...");
		
	}

	
	
	
}
