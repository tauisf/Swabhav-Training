package com.aurionpro.scanner;

import java.util.Scanner;

public class DistanceBetweenToPoint {

	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter the X1  :");
		float x1 =  scanner.nextFloat();
		
		System.out.println("Enter the X2 :");
		float x2 =  scanner.nextFloat();
		
		System.out.println("Enter the Y1 :");
		float y1 =  scanner.nextFloat();
		
		System.out.println("Enter the Y2 :");
		float y2 =  scanner.nextFloat();
		
		double distance =Math.sqrt(((x2 -x1)*(x2 -x1))+((y2 - y1)*(y2 - y1)));
		
		System.out.println("Ditance between two points is: "+distance);
	}

}
