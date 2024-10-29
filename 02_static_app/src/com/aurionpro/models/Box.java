package com.aurionpro.models;

public class Box {
	
	private int width;
	private int depth;
	private int height;
	
	
	public void increment() {
		width++;
		depth++;
		height++;
	}
	public void display() {
		System.out.println("the width of the box is: "+width);	
		System.out.println("the depth of the box is: "+depth);
		System.out.println("the height of the box is: "+height);
		System.out.println();
	}
	
	
	static {
		System.out.println("The Box Class is loaded");
	}
}
