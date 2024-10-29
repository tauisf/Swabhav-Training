package com.aurionpro.assignment;

import java.util.Random;
import java.util.Scanner;

public class BookCricketGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new  Random();
		boolean playGame = true;
		
		
		while(playGame) {
			 boolean isGameOn = true;
			 int player1Score = 0;
	         int player2Score = 0;
	         int currentPlayer = 1;
		
				while(isGameOn) {
						boolean turnEnd = true;
						int tempScore = 0;
						int wickets = 0;
						int totalScore =0;
						
						System.out.println(" ");
						System.out.println("=======Player " + currentPlayer + " turn========");
 
						while(wickets  < 5) {
			
								while(turnEnd) {
									System.out.println(" ");
									System.out.println("Press any key to open a random page of the book");
									char openPage = scanner.next().charAt(0);
									
									int pageNumber = random.nextInt(100)+1;
									System.out.println("Random page Number : "+pageNumber);
									int lastNumber = pageNumber % 10;
									System.out.println("Last number is : "+lastNumber);
									
									
									if(lastNumber == 0 || lastNumber == 7 || lastNumber == 8 || lastNumber == 9) {
										wickets++;
										System.out.println("----You lose one "+wickets+" Wicket----");
										System.out.println(" ");
										tempScore += totalScore;
										
										
									}else  {
										tempScore += lastNumber;
										System.out.println("Current Score: " + tempScore);
									}
									if(wickets >= 5) {
										turnEnd = false;
									}
																	
								}// end of first while loop
					
						}// second while loop
						
						System.out.println("The totalScore is : "+tempScore);

						if (currentPlayer == 1) {
		                    player1Score += tempScore;
		                    currentPlayer = 2;  // setting the current player to  2 for second player
		                } else {
		                    player2Score += tempScore;
		                    isGameOn = false; // ending the  game for both player
		                }
		                
		                System.out.println("Scores: Player 1: " + player1Score + ", Player 2: " + player2Score);
		                System.out.println(" ");
		                
				}// third  while loop ends
				
				  if(player1Score > player2Score) {
	                	System.out.println("---Player 1 Wins--- ");
	                }else {
	                	System.out.println("----Player 2 Wins--- ");
	                }
						
				System.out.println("Do you want to play again? (y/n): ");
				String choice2 = scanner.next();

				if (choice2.equals("y")) {
					playGame = true;
				} else {
					playGame = false;
					System.out.println("Thank you for Playing the Game!!");
				}
				
				
		}//Fourth while ends  loop
		

	}

}
