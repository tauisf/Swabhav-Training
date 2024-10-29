package com.aurionpro.assignment;

import java.util.Scanner;

public class CashCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the Amount: ");
        int amount = scanner.nextInt();
        int remainingAmount = 0 ;
        
        if(amount % 100==0) {
        
        	if(amount <= 50000) {
        	
        	
        		System.out.println("You Can check the money");
        	
        	
        		if(amount >= 2000) {
        			remainingAmount = amount / 2000;
        			amount = amount - (remainingAmount*2000);
        			System.out.println("Two thousand: "+ remainingAmount);
        		
        		} if(amount >=500) {
        			remainingAmount = amount / 500;
        			amount = amount - (remainingAmount*500);
        			System.out.println("Five Hundered: "+ remainingAmount);
        		} if(amount >= 200) {
        			remainingAmount = amount / 200;
        			amount = amount - (remainingAmount*200);
        			System.out.println("Two Hundered: "+ remainingAmount);
        		} if(amount >= 100) {
        			remainingAmount = amount / 100;
        			amount = amount - (remainingAmount*100);
        			System.out.println("One Hundered: "+ remainingAmount);
        		}
            
        		
          }else {
        	System.out.println("Enter less money than 50000");
          }
        	
        }else {
    		System.out.println("Enter Money in multiple of 100");
    	  }

	}

}
