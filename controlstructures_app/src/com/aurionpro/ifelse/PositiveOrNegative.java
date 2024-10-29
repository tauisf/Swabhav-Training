package com.aurionpro.ifelse;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int number = scanner.nextInt();
		

		if(number >= 0 ) {
			System.out.println("The number is Positive");
		}else {
			
			System.out.println("The number is negative");
		}

	}

}
