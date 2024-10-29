package com.aurionpro.array;

import java.util.Scanner;

public class CreateArray {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int[] array;
		
		
		System.out.println("enter the Size Of array");
		int number = scanner.nextInt();
		
		
		array = new int[number]; 
		
		for(int i = 0 ; i < number ;i++ ) {
			
			System.out.println("array is  "+(i+1));
			array[i] += 1;
		}
		

	}

}
