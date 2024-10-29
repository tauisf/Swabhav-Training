package com.aurionpro.poc;

public class TypeCasting {

	public static void main(String[] args) {
		int number1 = 10;	
		double number2 = number1; // implicit type casting
		
		
		System.out.println("Integer: " + number1);
	    System.out.println("Double: " + number2);
	    
	    System.out.println("");
	    
		
		double number3 = 2.34;
		int number4 = (int) number3; // explicit type casting 
		
		 System.out.println("Double: " + number3);
	     System.out.println("Integer: " + number4);
	     
	     
	     byte a = 1;
	     byte b = (byte) (a + 2); // integer 2 into byte   expression also has type 
	     System.out.println("The number is in byte "+b);
	     
	     float a1 = 10.5f; // every literal has type
	     
	}

}
