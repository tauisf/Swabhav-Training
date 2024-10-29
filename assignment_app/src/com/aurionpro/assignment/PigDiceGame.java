package com.aurionpro.assignment;

import java.util.Random;
import java.util.Scanner;

public class PigDiceGame {

	public static void main(String[] args) {

		Scanner  scanner = new Scanner(System.in);
		Random random = new Random();
		
		boolean playGame = true;
		
	while(playGame) {
		
		int totalScore = 0; 
		int turn = 1;
		System.out.println("TURN no " + turn);
		
		while(totalScore < 20  ) {
			int turnScore = 0;
			boolean turnEnd = false;// to start the turns if '1' or "h " comes change the value;  if we true here it will only run once
		
		
			while(!turnEnd) {				// true
				System.out.print("Roll or hold? (r/h): ");
				String choice = scanner.next();
				
				if(choice.equals("r")) {
					int die = random.nextInt(6) + 1; // adding one shift the range from 0-5 to 1-6
	                System.out.println("Die: " + die);
	               
	                
	                	if(die == 1) {
	                		System.out.println("Turn over. No score.");
	                		turnScore = 0;  // lose all point
	                		turnEnd = true;
	                		break; 
	                		               		
	                	}else {
	                		 if(totalScore >= 20) {
	                 			System.out.println("Your won in  "+turn+" Game over!");
	                 			turnEnd = true;
	                 			break;
	                 			
	                 		}else {
	                 			turnScore += die;
	                 			totalScore += turnScore;
	                 		}
	                		 
	                	}
	               
				}else if (choice.equals("h")) {
					System.out.println("Your turnScore is: "+turnScore);
					totalScore += turnScore;
					System.out.println("Your totalScore is: "+totalScore);
					turnScore = 0; // resetting the turnScore after every hold choice
					
					if(totalScore >= 20) {
						System.out.println("Your won in  "+turn+" Game over!");
						
					}
					
					turn++;
					System.out.println("-------TURN " + turn+"-------"); 
					
					
				}else {
					System.out.println("invalid input!!");
				}
				
				
				
		
			}// first while loop end here
			
			 if (totalScore >= 20) {
                 break;
             }
			
			
		}// second while loop ends here
		
		 System.out.println("Do you want to play again? (y/n): ");
	        String choice2 = scanner.next();

	        if (choice2.equals("y")) {
	            playGame = true;
	        } else {
	            playGame = false;
	            System.out.println("Game Over!!");
	        }
		 

        
	}// third while loop ends here
			
	
  }
	
	
	
}
	
	

	
	
