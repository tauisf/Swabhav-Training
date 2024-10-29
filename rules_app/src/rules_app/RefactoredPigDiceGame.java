package rules_app;

import java.util.Random;
import java.util.Scanner;

public class RefactoredPigDiceGame {

	
		  public static void main(String[] args) {
			  Scanner scanner = new Scanner(System.in);
		        Random random = new Random();

		        System.out.println("Welcome to the Pig Dice Game!");

		        boolean playGame = true;

		        while (playGame) {
		            playSingleGame(scanner, random);
		            playGame = askToPlayAgain(scanner);
		        }

		        System.out.println("Thanks for playing! Game Over!!");
		    }

		    private static void playSingleGame(Scanner scanner, Random random) {
		        int totalScore = 0;
		        int turn = 1;

		        while (true) { 
		            System.out.println("------- TURN " + turn + " -------");
		            boolean turnEnd = false;

		            while (!turnEnd) {
		                String choice = getPlayerChoice(scanner);
		                
		                if (choice.equals("r")) {
		                    int die = rollDice(random);

		                    if (die == 1) {
		                        System.out.println("You rolled a 1! You lose all points! Game over!");
		                        totalScore = 0;  
		                        return;  //player lose  Exit the game
		                    }

		                    totalScore += die;  
		                    System.out.println("Your total score is: " + totalScore);
		                    
		                   
		                    if (totalScore >= 20) {
		                        System.out.println("You won with a total score of " + totalScore + "! Game over!");
		                        return; //  player win ,Exit the game
		                    }
		                } else if (choice.equals("h")) {
		                    System.out.println("You chose to hold. Your total score is: " + totalScore);
		                    turnEnd = true; 
		                } else {
		                    System.out.println("Invalid input! Please enter 'r' to roll or 'h' to hold.");
		                }
		            }

		            turn++; 
		        }
		    }

		    private static String getPlayerChoice(Scanner scanner) {
		        System.out.print("Roll or hold? (r/h): ");
		        return scanner.next();
		    }

		    private static int rollDice(Random random) {
		        int die = random.nextInt(6) + 1;
		        System.out.println("You rolled a " + die);
		        return die;
		    }

		    private static boolean askToPlayAgain(Scanner scanner) {
		        System.out.print("Do you want to play again? (y/n): ");
		        String choice = scanner.next();
		        return choice.equals("y");
		    }
		}