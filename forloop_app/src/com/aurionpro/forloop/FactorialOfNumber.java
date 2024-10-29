package com.aurionpro.forloop;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Enter a number: ");
		 int number = scanner.nextInt();
		 
		 int fact = 1;
		 for(int i = 1 ; i < number; i++) {
			  fact = number*i;
			
		 }
		 System.out.println("Factorial of the number is: "+fact);


	}

}
