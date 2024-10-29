package com.aurionpro.assignment;

import java.util.Scanner;

public class TreasureIsland {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	        System.out.println("Welcome to Treasure Island.");
	        System.out.println("Your mission is to find the treasure.");

	        // First decision: left or right?
	        System.out.println("You're at a crossroad. Do you want to go 'left' or 'right'?");
	        String choice1 = scanner.nextLine().toLowerCase();
	        
	        
	        if (choice1.equals("left")) {
	            // Second decision: swim or wait?
	            System.out.println("You've come to a lake. There is an island in the middle of the lake.");
	            System.out.println("Type 'swim' to swim across or 'wait' to wait for a boat.");
	            String choice2 = scanner.nextLine().toLowerCase();
	       
	            
	            if (choice2.equals("wait")) {
	                // Third decision: Which door?
	                System.out.println("You arrive at the island unharmed. There is a house with 3 doors.");
	                System.out.println("One red, one yellow, and one blue. Which color do you choose?");
	                String choice3 = scanner.nextLine().toLowerCase();
	                
	                if (choice3.equals("red")) {
	                    System.out.println("It's a room full of fire. Game Over.");
	                } else if (choice3.equals("blue")) {
	                    System.out.println("You are eaten by beasts. Game Over.");
	                } else if (choice3.equals("yellow")) {
	                    System.out.println("You found the treasure! You Win!");
	                } else {
	                    System.out.println("You chose a door that doesn't exist. Game Over.");
	                }    
	                
	            
	            
	            } else if (choice2.equals("swim")) {
	                System.out.println("You are attacked by trout. Game Over.");
	            }else {
	                System.out.println("Invalid choice. Game Over.");
	            }
	        
	        
	                
	            }else if (choice1.equals("right")) {
		            System.out.println("You fell into a hole. Game Over.");
		        } else {
		            System.out.println("Invalid choice. Game Over.");
		        }
	}

}







