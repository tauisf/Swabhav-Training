package com.aurionpro.assignment;

import java.util.Scanner;

public class RideCostCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your height in centimeters: ");
        int height = scanner.nextInt();
     
        int baseCost = 0;
        
        
        if (height > 120) {
            System.out.println("You can ride.");
        
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        if(age < 12) {
        	baseCost = 5;
        }else if(age <= 18) { 
        	baseCost = 7;	
        }else if(age < 45) {
        	baseCost = 12;
        }else if(age <= 55) {
        	baseCost = 0;
        }else {
            System.out.println("Invalid age.");
        }
        
        System.out.print("Do you want a photo? (y or n): ");
        char choice = scanner.next().toLowerCase().charAt(0); 
        
        if (choice == 'y') {
            baseCost += 3;
           
        }
        System.out.println("Your total cost is: "+baseCost );
        
	    }else{
       	 System.out.println("You cannot ride."); 
	   
	    }
	    
	}

}
