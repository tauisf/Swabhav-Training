package com.aurionpro.switchloop;

import java.util.Scanner;

public class NumberOfMonth {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter the number of  a Day: ");
		int day = scanner.nextInt();
		
		switch(day) {
		
		case 3 :     
		case 4 : 
		case 5 : 
		System.out.println("Its is Summer ");
        			break;
		case 6 : 
		case 7 :
		case 8 : 
		case 9 : 
		System.out.println("Its is Rainy ");
					break;
					
		case 1 : 
		case 2 : 			
		case 10 :
		case 11 : 
		case 12 : 
		System.out.println("Its is Winter");
		break;
		
		
		default : System.out.println("Invalid number of  a Months");
		}
	}

}
