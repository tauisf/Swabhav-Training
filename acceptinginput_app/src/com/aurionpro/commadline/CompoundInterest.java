package com.aurionpro.commadline;

public class CompoundInterest {

	public static void main(String[] args) {
		
		
		float Amount  = Float.parseFloat(args[0]);
		float ROI = Float.parseFloat(args[1]);
		float time = Float.parseFloat(args[2]);
		
		double  rate = Math.pow((1 + (ROI/100)), time);
		
		double compound = Amount* rate;
		
		System.out.println("The Compound Interest is : "+ compound );
	

	}

	

}
