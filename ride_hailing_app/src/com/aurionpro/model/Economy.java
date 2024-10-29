package com.aurionpro.model;

public class Economy extends Ride{
	private int surgePrice = 10 ;
	



	public Economy(int distance) {
		super(distance);
	}




	@Override
	public int calculateFare() {
		if( getDistance()> 0 ) {
			System.out.println("The base price is:  "+surgePrice);
			setPrice(surgePrice+(getDistance()*10));
			System.out.println("Your price for the ride is: "+getPrice());
			return 0;
		}
		System.out.println("Please enter valid distance!!");
		return 0;
		
	}


	

}
