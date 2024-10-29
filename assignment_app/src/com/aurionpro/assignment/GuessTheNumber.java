package com.aurionpro.assignment;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		
		
		boolean playGame =true;
		
		while(playGame) {
			boolean isGameOn = true;
		
			int target = random.nextInt(100) + 1;
			int attempts = 0;
			int lowerLimit = 1;
			int upperLimit = 100;
        
       
			System.out.println("Welcome To the Guessing Number Game ");
			System.out.println("Guess a number between 1 - 100" );

		
			while(isGameOn) {
				System.out.println("Please Enter the guessing number");
				int guessNumber = scanner.nextInt();
			
				if(guessNumber < upperLimit & guessNumber > lowerLimit) {
				
				if(target == guessNumber) {
					System.out.println("You close  from the Target ");
					isGameOn = false;
				}else if(Math.abs(target - guessNumber) <= 10 ) {
					System.out.println("You close  from the Target ");
					
				}else if(target < guessNumber) {
					System.out.println("Your guess is too high.");
					
				}else {
					System.out.println("Your guess is too low.");
				}
			}else {
				System.out.println("Invalid input");
			}
				attempts++;
		
				if(attempts >= 5) {
					System.out.println("All attempts are used. The correct number was " + target);
                    isGameOn = false;
				}
				
			}
			System.out.println("Do you want to play again? (y/n): ");
			String choice2 = scanner.next();

			if (choice2.equals("y")) {
				playGame = true;
			} else {
				playGame = false;
				System.out.println("Thank you for Playing the Game!!");
			}
        
        
		}
		
	}
		
}


