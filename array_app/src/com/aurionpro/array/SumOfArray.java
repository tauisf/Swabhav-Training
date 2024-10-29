package com.aurionpro.array;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		
			Scanner scanner =  new Scanner(System.in);
			int[] array;
			
			
			System.out.println("enter the Size Of array");
			int number = scanner.nextInt();
			
			
			array = new int[number];
			System.out.println(" Enter the Number in array:");
			int sum =0;
			
			for(int i = 0 ; i < number ;i++ ) {
				int num = scanner.nextInt();
				array[i] = num;
				sum = sum + array[i];
				
			}
	
			System.out.println("the Sum of array is :"+sum);
		}

	}


