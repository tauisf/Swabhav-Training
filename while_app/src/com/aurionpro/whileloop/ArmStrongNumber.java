package com.aurionpro.whileloop;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		int sum = 0;
		int temp = number;
		
		
		while(number != 0) {
			int digit = number % 10;
			sum = sum + (digit*digit*digit);
			number = number / 10;	
		}
		
		if(temp == sum) {
			System.out.println("Number is an ArmStrong Number: ");
		}else {
			System.out.println("Number is  not  ArmStrong Number: ");
		}


	}

}
