package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.models.CricketPlayer;

public class CricketApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of players: ");
		int nums  = scanner.nextInt();
		int player = 1;
		
		
		CricketPlayer players[] = new CricketPlayer[nums];
		for(int i = 0; i < players.length;i++) {
			
			System.out.println("===Enter Player "+player+" details===");
			
			System.out.print("Enter the player Id: ");
			int playerId = scanner.nextInt();
			
			System.out.print("Enter the name: ");
			String  name = scanner.next();
			
			System.out.print("Enter the matches: ");
			int matches = scanner.nextInt();
			
			
			System.out.print("Enter the runs: ");
			double runs = scanner.nextDouble();
			
			System.out.print("Enter the Wickets: ");
			double wickets = scanner.nextDouble();
			
			
			players[i] = new CricketPlayer(playerId,  name, matches,  runs,  wickets);
			players[i].calculateAverage();
			player++;
			System.out.println(" ");
		}
	
		 displayAverage(players);
		getMaxAverage(players);
		
	}
	
	 private static void displayAverage(CricketPlayer[] players) {
		 //sorting the array
		 for (int i = 0; i < players.length; i++) {
	           
	            for (int j = 0; j < players.length - i - 1; j++) {
	                
	                if (players[j].getAverage() > players[j+1].getAverage() ) {
	                   
	                    CricketPlayer temp = players[j];
	                    players[j] = players[j + 1];
	                    players[j + 1] = temp;
	                }
	            }
	        }
		
		 int count = 1;
		 // Display the Players
		 for (int index = 0; index < players.length; index++) {
			    System.out.println("=============The players "+count+" detail=========");
			    System.out.println("Player id is: "+ players[index].getPlayerId());
				System.out.println("Player name is: "+ players[index].getName());
				System.out.println("The Matches played: "+ players[index].getMatches());
				System.out.println("The runs scored: "+ players[index].getRuns());
				System.out.println("The Wickets taken: "+ players[index].getWickets());
				System.out.println("The Average is : "+ players[index].getAverage());
				System.out.println(" ");
				count++;
		 }
		 
		 
	}

	static private void  getMaxAverage(CricketPlayer players[]) {
		double   maxAverage = players[0].getAverage() ;
		int index = 0 ;
		for(int i = 1; i < players.length;i++) {
			if(players[i].getAverage() > maxAverage ) {
				maxAverage = players[i].getAverage();
				index = i;
				
			}
			
		}
		System.out.println("=============The players detail having max average=========");
		System.out.println("The max average is: "+ maxAverage);
		System.out.println("Player id is: "+ players[index].getPlayerId());
		System.out.println("Player name is: "+ players[index].getName());
		System.out.println("The Matches played: "+ players[index].getMatches());
		System.out.println("The runs scored: "+ players[index].getRuns());
		System.out.println("The Wickets taken: "+ players[index].getWickets());
		
	
	}
	 
	
	 

}
