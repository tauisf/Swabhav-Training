package com.aurionpro.switchloop;

import java.util.Scanner;

public class DaysOfWeek {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter the number of  a Day: ");
		int day = scanner.nextInt();
		
		switch(day) {
		case 1 : System.out.println("Its is Monday ");
					break;
		case 2 : System.out.println("Its is Tuesday ");
		        	break;
		case 3 : System.out.println("Its is Wednesday ");
					break;      
		case 4 : System.out.println("Its is Thursday ");
        			break;
		case 5 : System.out.println("Its is Friday ");
        			break;
		case 6 : System.out.println("Its is Saturday ");
        			break;
		case 7 : System.out.println("Its is Sunday ");
					break;
		
		default : System.out.println("Invalid number of  a day");
		}
		
		

	}

}
