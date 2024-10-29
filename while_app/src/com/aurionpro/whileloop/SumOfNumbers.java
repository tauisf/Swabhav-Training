package com.aurionpro.whileloop;

public class SumOfNumbers {
	public static void main(String[] args) {
		 int i = 1;
		 int sum = 0;
		 
		 while(i <= 100) {
			sum =  sum + i;
						i++;
		 }
		
		 System.out.println("Sum of the Number is: "+sum);

	}
}