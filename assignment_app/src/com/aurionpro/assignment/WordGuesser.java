package com.aurionpro.assignment;

import java.util.Random;
import java.util.Scanner;

public class WordGuesser {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		Random random = new Random();
		
		 String[] words = {"apple", "banana", "cherry", "date", "berry"};
		 
		
		 
		 boolean playGame = true;
		 
		 while(playGame) {
			 
			 	int attempts = 0;
			 	boolean isGameOn =true;
			 	// Select a random word
			 	int randomIndex = random.nextInt(words.length); // Select random index
			 
			 	String randomWord = words[randomIndex];
			 
			 	System.out.println("The Random Word is "+randomWord);
			 	char[] currentWord = new char[randomWord.length()];
			 
			 	for (int i = 0; i < randomWord.length(); i++) { // fill All character with '_'
		            	currentWord[i] = '_';
		            	
		        	}
			 	System.out.println(currentWord);
			 
			 	System.out.println("Welcome To the Guessing Word Game ");
			 	
			 	System.out.println("It is "+ randomWord.length()+" letter word");

			 		while(isGameOn) {
				
				 		boolean correctGuess = true;
				 		System.out.println("Please guess the word ");
				 		
				 			char guess = scanner.next().charAt(0);
				
				 		for(int i = 0; i < randomWord.length();i++) {
					 		if(guess == randomWord.charAt(i)) { // we are matching character her we cannot take string
						 		currentWord[i] = guess; // adding the character in the match index place
						 		correctGuess = false;
						 
					 		} 
						 		}
				 
				 		if(correctGuess) {
					 		System.out.println("Wrong guess!");
					 
				 		}
				 
						 attempts++;
				 		System.out.println(currentWord);
				 
				 		if(String.valueOf(currentWord).equals(randomWord)) { // changing the type of currentWord into string
							 System.out.println("You have geuss the correct word "+randomWord);
					 		isGameOn = false;
				 		}
				 
				 		if(attempts > 6) {
								System.out.println("All attempts are used. The correct word is " +randomWord );
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
