package com.aurionpro.assignment;

import java.util.Scanner;

public class PrimeNumberPiramid {

	
	public static boolean PrimeChecker(int number) {
		if(number == 2)
			return true;
		for(int i = 2 ; i < number  ; i++){      
			if(number % i== 0){      
				return  false;
			}
		}
		return true;
		
	}
		
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter A number: ");
		int row = scanner.nextInt();
		int number = 2; 
		
		for(int i = 1; i <= row;i++) {  
			for(int j = 1 ; j <= i; j++) {
				while(!PrimeChecker(number)) {
					number++;
				}
				 System.out.print(number + " "); 
	                number++;
			}
			System.out.println(" ");
		}
	}

}
