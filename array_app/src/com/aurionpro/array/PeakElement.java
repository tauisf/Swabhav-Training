package com.aurionpro.array;

import java.util.Scanner;

public class PeakElement {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int[] array;
		
		
		System.out.println("Enter the Size Of array");
		int size = scanner.nextInt();
		

		array = new int[size];
		System.out.println("Enter the Number in array:");
		
		int peak = 0;

		for(int i = 0 ; i < size ; i++ ) {
			int num = scanner.nextInt();
			array[i] = num;
			
		}
		 if (size == 1 || array[0] >= array[1]) { // First element
	            peak = array[0];
	        }
	        
	       
	        if (array[size - 1] >= array[size - 2]) { // Last element
	            peak = array[size - 1];
	        }

	       
	        for (int i = 1; i < size - 1; i++) { // middle element
	            if (array[i] >= array[i - 1] && array[i] >= array[i + 1]) {
	                peak = array[i];
	            }
	        }
		
		System.out.println("the Peak element: "+peak);
	}

}
