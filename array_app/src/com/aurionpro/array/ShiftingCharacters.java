package com.aurionpro.array;

import java.util.Scanner;

public class ShiftingCharacters {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Enter the string ");
		 String str = scanner.next();
		 
		 String newStr = "";
		 
		 for( int i = 0; i <str.length();i++) {
			 char hold = (char)(str.charAt(i)+ 3);
			 newStr += hold;
		 }
		 System.out.println("the Shifted string is :  "+newStr);
	}

}
