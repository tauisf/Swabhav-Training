package com.aurionpro.assignment;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		int[] array;
		
		
		System.out.println("enter the Size Of array");
		int number = scanner.nextInt();
		
		
		array = new int[number];
		System.out.println(" Enter the Number in array:");
		
		
		for(int i = 0 ; i < number ;i++ ) {
			int num = scanner.nextInt();
			array[i] = num;
			
		}
		
		
		int max = array[0];
		int secondLargestNumber = array[1];
		
		for(int i = 0 ; i < number ;i++ ) {
			if(array[i] > max) {
				 max = array[i];		 
			}
			
		}
		
		for(int i = 2 ; i < number ;i++ ) { // start from 2 because of line 29;
			if(max != array[i]) {
				if(array[i] > secondLargestNumber ) {
					secondLargestNumber = array[i];		 
				}
			
			}
			
		}
		
		System.out.println(" The Second Largest number in array is : "+secondLargestNumber);

			

	}

}
