package rules_app;

import java.util.Scanner;

public class MultiplicationOfArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[][] matrix1 = enterMatrixDetails(1, scanner);
        int[][] matrix2 = enterMatrixDetails(2, scanner);
        
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Error: Number of columns in the first matrix must equal the number of rows in the second matrix.");
            return;
        }

        int[][] result = multipleMaxtrix(matrix1, matrix2);
        System.out.println("The multiplication of the matrix is:");
        printMatrix(result);
		
        
		
	

	}
	
	public static int[][] enterMatrixDetails(int count, Scanner scanner){
		 System.out.println("Enter the details of " + count + " array");
	        System.out.print("Enter the size of rows for the array: ");
	        int rows = scanner.nextInt();
	        
	        System.out.print("Enter the size of columns for the array: ");
	        int cols = scanner.nextInt();
	        
	        int[][] matrix = new int[rows][cols];
	        enterEachMaxtrix(matrix, rows, cols, scanner);
		
	        return matrix;
	}
	
	
	public static void enterEachMaxtrix(int[][] matrix , int rows ,int cols,Scanner scanner) {
		
		for(int rowIndex  = 0; rowIndex < rows ;rowIndex++) {
			enterElement(matrix,rows,cols,rowIndex,scanner);
		}
	
		printMatrix(matrix);
	}
	
	public static void enterElement(int[][] matrix , int rows, int cols,int rowIndex,Scanner scanner) {
		for(int coloumnIndex  = 0; coloumnIndex < cols ;coloumnIndex++) {
			System.out.print("Enter the elemnent ["+rowIndex+"]"+"["+coloumnIndex+"] elements: ");
			matrix[rowIndex][coloumnIndex] = scanner.nextInt();
		}
	
	}
	
	
	
		
		
	
	private static int[][] multipleMaxtrix(int[][] matrix1,int[][] matrix2) {
		 int rows1 = matrix1.length;
	        int cols2 = matrix2[0].length;
	        int commonDim = matrix1[0].length; // or matrix2.length

	       
		
		int	mul[][] = new int[rows1][cols2];
		
		
		for(int rowIndex  = 0; rowIndex < rows1 ;rowIndex++) {
			multipleMaxtrixColumn(matrix1,matrix2,mul,cols2,rows1,commonDim,rowIndex);
		}
		return mul;
	}
	
	public static void  multipleMaxtrixColumn(int[][] matrix1,int[][] matrix2,int[][] mul,int cols2,int rows1,int commonDim,int rowIndex ) {
		for(int coloumnIndex  = 0; coloumnIndex < cols2 ;coloumnIndex++) {
			
			multipleMaxtrixColumn1(matrix1,matrix2,mul,cols2,rows1,commonDim,rowIndex,coloumnIndex);
		
		
		}
		

	}
	
	public static void  multipleMaxtrixColumn1(int[][] matrix1,int[][] matrix2,int[][] mul,int cols2,int rows1,int commonDim,int rowIndex,int coloumnIndex  ){
		for(int k = 0; k < commonDim  ;k++ ) { //col1 == rows2 condition matrix that why setting to col1
			
			mul[rowIndex][coloumnIndex]  += matrix1[rowIndex][k] * matrix2[k][coloumnIndex];
		}
	}
	
	public static void printMatrix(int[][] result) {
		 for (int[] row : result) { //accessing each row  
			 printElement(row);
	    }
	}
		 
	public static void printElement(int[] row) {
		
		for (int value : row) { // accessing each value in the  each row
            System.out.print(value + " ");
        }
        System.out.println();
        
    }

	

}
