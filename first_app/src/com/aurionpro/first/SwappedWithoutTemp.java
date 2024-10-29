package com.aurionpro.first;

public class SwappedWithoutTemp {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 20;
		num1 =  num1 + num2;
		
		 num2 = num1 - num2;
		 num1 = num1 - num2;

	}

}
