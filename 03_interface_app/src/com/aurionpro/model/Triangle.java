package com.aurionpro.model;

public class Triangle {
	private int base;
	private int height;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	public void area() {
		System.out.println("Area is: "+(0.5*(height*base)));
	}
}
