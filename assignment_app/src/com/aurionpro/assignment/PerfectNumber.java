package com.aurionpro.assignment;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int rem,sum = 0,temp = 0;
		
		System.out.println("Enter a number");
		int number =scanner.nextInt();
		 temp = number;
		
		
		for(int i = 1; i < number/2; i++) {  
                rem = number % i;  
                if (rem == 0)  
                           {  
                                 sum = sum + i;  
                            }  
        }
		
		if (sum == temp) { 
			System.out.println(temp+" is a Perfect Number");  
		}else {  
			System.out.println(temp+" not a Perfect Number");  
		}


	}

}
