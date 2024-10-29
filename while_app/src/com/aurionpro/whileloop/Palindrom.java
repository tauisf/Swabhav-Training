package com.aurionpro.whileloop;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		int rev = 0;
		int temp = number;
		
		while(number != 0) {
			int digit = number % 10;
			rev = rev*10 + digit;
			number = number / 10;	
		}
		
		if(temp == rev) {
			System.out.println("Number is Panlindrom: ");
		}else {
			System.out.println("Number is  not a Panlindrom: ");
		}

	}

}
