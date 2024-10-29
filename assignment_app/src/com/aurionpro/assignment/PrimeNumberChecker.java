package com.aurionpro.assignment;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean flag = true;
		System.out.println("Enter a number");
		int number =scanner.nextInt();
		
		
		
		if (number < 2) {
			flag = false;
		}else if(number == 2) {
				 flag = true;
		}else {
			for(int i = 2 ; i < number  ; i++){      
				if(number % i== 0){      
					flag = false;
				}
			}
		}
			
			if(flag) {
				 System.out.println(number + " is  a prime number.");
			}else {
				System.out.println(number + " is   not a prime number.");
			}
		
		
	}

}
