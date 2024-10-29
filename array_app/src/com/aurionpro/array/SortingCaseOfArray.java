package com.aurionpro.array;

import java.util.Scanner;
import java.util.Arrays;

public class SortingCaseOfArray {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int[] array;
		
		
		System.out.println("Enter the Size Of array");
		int number = scanner.nextInt();
		
		
		array = new int[number];
		System.out.println("Enter the Number in array:");
		
		
		int square =1;
		
		for(int i = 0 ; i < number ; i++ ) {
			int num = scanner.nextInt();
			array[i] = num;
			
				square = array[i]* array[i];
				array[i] = square;
			}
		
		 Arrays.sort(array);
		
			System.out.println("The square of every element is:");
			for(int i = 0 ; i < number ;i++ ) {
			System.out.println(array[i]);
			}
	
	}
}
