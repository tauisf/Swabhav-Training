package com.aurionpro.scanner;

import java.util.Scanner;

public class AreaOfTrapeziod {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the base1 :");
		float base1 =  scanner.nextFloat();
		
		System.out.println("Enter the base2 :");
		float base2 =  scanner.nextFloat();
		
		System.out.println("Enter the height  :");
		float height =  scanner.nextFloat();
		
		float area = ((base1 + base2)/2) + height;
		
		System.out.println("Area  of Trapeziod is: "+ area);
		

	}

}
