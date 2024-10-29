package com.aurionpro.adapters.model;

public class HatAdapter implements IItems {
	Hat hat;
	
	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}
	public String getName() {
		return hat.getLongName()+hat.getShortName();
	}
	public  double getPrice() {
		return hat.getBasePrice()*(hat.getBasePrice()/100);
	}
	
	
}
