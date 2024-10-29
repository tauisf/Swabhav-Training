package com.aurionpro.twoDimensionArray;

import java.util.Scanner;

public class MultiplicationOfMatrix {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of rows for first array: ");
		int rows1 = scanner.nextInt();
		
		System.out.println("Enter the size of columns for first array: ");
		int col1 = scanner.nextInt();
		
		int[][] array1 = new int[rows1][col1];
		
		System.out.println("Enter the element in first  array: ");
	
		for(int i  = 0; i < rows1 ;i++) {
			for(int j  = 0; j < col1 ;j++) {
				System.out.print("Enter the elemnent ["+i+"]"+"["+j+"] elements: ");
				array1[i][j] = scanner.nextInt();
				
			
			}
			System.out.println("");
			
		}
		System.out.println("The first  array is : ");
		for(int i  = 0; i < rows1 ;i++) {
			System.out.print("[ ");
			for(int j  = 0; j < col1 ;j++) {
				
				System.out.print(array1[i][j]);
				System.out.print(" ");
			
			}
			System.out.print(" ]");
			System.out.println(" ");
		}
		
		System.out.println("Enter the size of rows for Second array: ");
		int rows2 = scanner.nextInt();
		
		System.out.println("Enter the size of columns for Second array: ");
		int col2 = scanner.nextInt();
		
		int[][] array2 = new int[rows2][col2];
		
		System.out.println("Enter the element in first  array: ");
	
		for(int i  = 0; i < rows2 ;i++) {
			for(int j  = 0; j < col2 ;j++) {
				System.out.print("Enter the elemnent ["+i+"]"+"["+j+"] elements: ");
				array2[i][j] = scanner.nextInt();
				
			
			}
			System.out.println("");
			
		}
		
		System.out.println("The Second   array is : ");
		for(int i  = 0; i < rows2 ;i++) {
			System.out.print("[ ");
			for(int j  = 0; j < col2 ;j++) {
				
				System.out.print(array2[i][j]);
				System.out.print(" ");
			
			}
			System.out.print(" ]");
			System.out.println(" ");
		}
		
	
    	int	mul[][] = new int[rows1][col2];
		
	
		for(int i  = 0; i < rows1 ;i++) {
			for(int j  = 0; j < col2 ;j++) {
				mul[i][j] = 0;
				for(int k = 0; k < col1  ;k++ ) { //col1 == rows2 condition matrix that why setting to col1
 				
					mul[i][j]  += array1[i][k] * array2[k][j];
			}
			
			
			}
			System.out.println(" ");
		}
		
				System.out.println("The Sum of   array is : ");
				for(int i  = 0; i < rows1 ;i++) {
					System.out.print("[ ");
					for(int j  = 0; j < col2 ;j++) {
						
						System.out.print(mul[i][j]);
						System.out.print(" ");
					
					}
					System.out.print(" ]");
					System.out.println(" ");
				}
		

	


	}

}
