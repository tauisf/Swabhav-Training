package com.aurionpro.ifelse;

import java.util.Scanner;

public class MaximunOfNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the   First Number: ");
		int number1 = scanner.nextInt();
		
		System.out.println("Enter the   Second  Number: ");
		int number2 = scanner.nextInt();
		

		if(number1 >number2 ) {
			System.out.println("The First number is greater");
		}else {
			
			System.out.println("The Second number is greater");
		}

		
		
		
		
	}
}


