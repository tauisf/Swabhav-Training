package com.aurionpro.assignment_Sep30;
import java.util.Scanner;


 public class TransposeOfArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of rows for the  array: ");
		int rows = scanner.nextInt();
		
		System.out.println("Enter the size of columns for the array: ");
		int cols = scanner.nextInt();
		
		int[][] matrix = new int[rows][cols];
		
		enterMaxtrix(matrix, rows, cols, scanner);
		
		transposeMatrix(matrix, rows, cols);
	

	}
	
	public static void enterMaxtrix(int[][] matrix , int rows ,int cols,Scanner scanner) {
		for(int i  = 0; i < rows ;i++) {
			for(int j  = 0; j < cols ;j++) {
				System.out.print("Enter the elemnent ["+i+"]"+"["+j+"] elements: ");
				matrix[i][j] = scanner.nextInt();
			}
		
		}
	
		printMatrix(matrix);
	}
	
	
	public static void printMatrix(int[][] matrix) {
		 for (int[] row : matrix) { //accessing each row  
	            for (int value : row) { // accessing each value in the row
	                System.out.print(value + " ");
	            }
	            System.out.println();
	            
	        }
	    }
	
	public static void transposeMatrix(int[][] matrix , int rows ,int cols) {
		System.out.println("After the transpose");
		int[][] newMatrix = new int[cols][rows]; 
		for(int i  = 0; i < cols;i++) {
			for(int j  = 0; j < rows ;j++) {
				
				newMatrix[i][j] = matrix[j][i];
			}
		}
	
		printMatrix(newMatrix);
	} 
		
	

}
