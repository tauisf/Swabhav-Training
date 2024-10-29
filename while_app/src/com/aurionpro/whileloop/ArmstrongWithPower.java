package com.aurionpro.whileloop;

import java.util.Scanner;

public class ArmstrongWithPower {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		
		int temp = number;
		int counter = number;
		int raiseTo = 0;
		
		while(counter !=0) {
			raiseTo += 1;
			counter = counter / 10;
		}
		
		
		
		int sum = 0;
		while (number != 0) {
		    int digit = number % 10;                     
		    sum = sum + (int)Math.pow(digit, raiseTo);   // it returns double so typecasting
		    number = number / 10;                        
		}
		if(temp == sum) {
			System.out.println("Number is an ArmStrong Number: ");
		}else {
			System.out.println("Number is  not  ArmStrong Number: ");
		}


	}

}
