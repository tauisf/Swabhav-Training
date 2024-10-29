package com.aurionpro.isp.violation.model;

public class Robot implements IWorker {

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
		System.out.println("Robot can't eat  ...");
		
	}

	@Override
	public void drink() {
		System.out.println("Robot can't drink  ...");
		
	}
}
