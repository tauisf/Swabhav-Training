package com.aurionpro.model;

@FunctionalInterface
public interface ISayable {
	
	public void say();
	
	default void say1() {
		System.out.print("I am non asbstract");
	}
}
