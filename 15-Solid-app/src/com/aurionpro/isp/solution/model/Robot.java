package com.aurionpro.isp.solution.model;

public class Robot implements IWorkerSolution {

	@Override
	public void startWork() {
		System.out.println("Working ...");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Stop Working ...");
		
	}

}
