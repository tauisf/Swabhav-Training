package com.aurionpro.scanner;

import java.util.Scanner;

public class MiniutesToHours {

	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter the time in minutes :");
		int time =  scanner.nextInt();
		
		int hours = time / 60;
		int minutes = time % 60;
		
		System.out.println( hours +" Hours "+minutes  + " Minutes " );

	}

}
