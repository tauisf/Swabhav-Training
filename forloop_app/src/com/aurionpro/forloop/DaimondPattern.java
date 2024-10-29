package com.aurionpro.forloop;

import java.util.Scanner;

public class DaimondPattern {

	public static void main(String[] args) {
		
		int number, i, j;
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter a number !");
		 number = scanner.nextInt();
		 
		// upper part
		for(i = 1; i <= number;i++) {
			
			 for ( j = i; j < number; j++) {
	                System.out.print(" ");
	            }
			
			 for ( j = 1; j <= (2 * i - 1); j++) {
	                System.out.print("*");
	            }
	            System.out.println(); 
			}
		
		// down part
		for(i = number - 1 ; i >= 1;i--) {
			
			  for (j = i; j < number; j++) {  // Fix this loop condition
			        System.out.print(" ");
			    }
			
			 for ( j = 1 ; j <= (2 * i - 1); j++) {
	                System.out.print("*");
	            }
	            System.out.println(); 
			}
		}
	}


