package com.aurionpro.model;

public class Cricle implements Shape {
	private int radius;
	
	
	 public Cricle(int radius) {
		super();
		this.radius = radius;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	public void area() {
		System.out.println("Area is: "+(3.14*radius*radius));
	}
}
