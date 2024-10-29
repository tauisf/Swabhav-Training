package com.aurionpro.twoDimensionArray;

import java.util.Scanner;

public class MatrixOfArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of rows: ");
		int rows = scanner.nextInt();
		
		System.out.println("Enter the size of columns: ");
		int col = scanner.nextInt();
		
		int[][] array = new int[rows][col];
		
		System.out.println("Enter the element in array: ");
	
		for(int i  = 0; i < rows ;i++) {
			for(int j  = 0; j < col ;j++) {
				System.out.print("Enter the elemnent ["+i+"]"+"["+j+"] elements: ");
				array[i][j] = scanner.nextInt();
				
			
			}
			System.out.println("");
			
		}
		for(int i  = 0; i < rows ;i++) {
			System.out.print("[ ");
			for(int j  = 0; j < col ;j++) {
				
				System.out.print(array[i][j]);
				System.out.print(" ");
			
			}
			System.out.print(" ]");
			System.out.println(" ");
		}
		
		
	
	
	}

}
