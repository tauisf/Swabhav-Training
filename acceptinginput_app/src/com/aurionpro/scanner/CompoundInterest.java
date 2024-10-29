package com.aurionpro.scanner;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter the principle amount  :");
		float amount =  scanner.nextFloat();
		
		System.out.println("Enter the rate of interest :");
		float rateof =  scanner.nextFloat();
		
		System.out.println("Enter the time :");
		float time =  scanner.nextFloat();
		
		double  rate = Math.pow((1 + (rateof/100)), time);
		
		double compound = amount* rate;
		
		System.out.println("The Compound Interest is : "+ compound );

	}

}
