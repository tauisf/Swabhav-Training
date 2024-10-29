package com.aurionpro.id.solution.model;

public interface ILogger {

	
	default public void log() {
		System.out.println("Not services availble!");
	}
}
