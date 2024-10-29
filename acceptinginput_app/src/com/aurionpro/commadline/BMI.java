package com.aurionpro.commadline;

public class BMI {

	public static void main(String[] args) {
		
		
		float weight = Float.parseFloat(args[0]);
		float height = Float.parseFloat(args[1]);
		
		
		float calculator = weight / (height*height);
		
		System.out.println("BMI of person weigts(kgs) and height(meters): "+calculator);

	}

}
