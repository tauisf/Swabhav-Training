package com.aurionpro.operator;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = 5;
		int y = 10;
		
		
		//logical Operator : AND
		boolean resultOfAnd = (x > 0) && (y > x); 
		System.out.println(resultOfAnd);  // result will be true

		
		//logical Operator : OR
		boolean resultOfOr = (x < 0) || (y > x);
		System.out.println(resultOfOr);  // result will be true

		
		//logical Operator : NOT
		boolean resultOfNot = !(x > 0);
		System.out.println(resultOfNot);  // result will be false

	}

}
