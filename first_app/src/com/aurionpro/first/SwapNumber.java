package com.aurionpro.first;

public class SwapNumber {

	public static void main(String[] args) {
		
		
		int num1 = 10;
		int num2 = 5 ;
		
		System.out.println("Before swapped  num1: "+num1 +" num2: "+num2);
		
		int temp = num1 ;
		num1  = num2 ;
		num2 = temp;
		
		
		System.out.println("After  swapped num1: "+num1 +" num2: "+num2);
		
	}

}
