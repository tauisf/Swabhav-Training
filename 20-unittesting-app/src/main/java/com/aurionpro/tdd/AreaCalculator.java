package com.aurionpro.tdd;

public class AreaCalculator {

	public double CalculateAreaOfCircle(int radius) {
		return  (3.14*(radius*radius));
	}
	public int CalculateAreaOfRectangle(int length, int breadth ) {
		return length*breadth;
	}
	public int CalculateAreaOfSquare(int side) {
		return side*side;
	}
}
