package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Economy;
import com.aurionpro.model.Luxury;
import com.aurionpro.model.Premium;
import com.aurionpro.model.Ride;

public class RideApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean rideOn = true;
		
		while(rideOn) {
			System.out.print("1.Luxury  2.Premium  3.Economy  4.Exit : ");
			
			
			int choice = scanner.nextInt();
			
			switch(choice) {
			
			case 1 : 
				System.out.println("Enter distance  in Km: ");
				int distance = scanner.nextInt();
				Ride luxury = new Luxury(distance);
				luxury.calculateFare();
				break;
				
			case 2 : 
				System.out.println("Enter distance  in Km: ");
				int distance1 = scanner.nextInt();
				Ride premium = new Premium(distance1);
				premium.calculateFare();
				break;
				
			case 3 : 
				System.out.println("Enter distance  in Km: ");
				int distance2 = scanner.nextInt();
				Ride econony = new Economy(distance2);
				econony.calculateFare();
				break;
				
			case 4 : 
				rideOn = false;
				break;
				
			default : System.out.println("Enter a valid choice ");
			
			}
			
		}
		System.out.println("Thank you for riding with us ! ");
	}

}
