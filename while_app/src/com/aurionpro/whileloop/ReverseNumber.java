package com.aurionpro.whileloop;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		int rev = 0;
		
		while(number != 0) {
			int digit = number % 10;
			rev = rev*10 + digit;
			number = number / 10;
			
		}
		System.out.println("The Sum if the Digits is: "+rev);

	}
}