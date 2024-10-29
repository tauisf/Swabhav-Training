package com.aurionpro.commadline;

public class DistanceBetweenTwoPoints {

	public static void main(String[] args) {
		
		
		float x1 = Float.parseFloat(args[0]);
		float x2 = Float.parseFloat(args[1]);
		float y1 = Float.parseFloat(args[2]);
		float y2 = Float.parseFloat(args[3]);
		
		double distance =Math.sqrt(((x2 -x1)*(x2 -x1))+((y2 - y1)*(y2 - y1)));
		
		System.out.println("Ditance between two points is: "+distance);
	}

}
