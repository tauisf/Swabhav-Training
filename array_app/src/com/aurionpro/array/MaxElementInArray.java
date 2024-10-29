package com.aurionpro.array;

import java.util.Scanner;

public class MaxElementInArray {

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
		int max = 0;
		
		for(int i = 0 ; i < number ;i++ ) {
			if(array[i] > max) {
				 max = array[i];		 
			}
			
		}
		System.out.println(" the max elemet is  :"+max);


	}

}
