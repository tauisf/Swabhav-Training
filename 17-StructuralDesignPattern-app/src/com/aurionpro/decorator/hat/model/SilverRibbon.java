package com.aurionpro.decorator.hat.model;

public class SilverRibbon extends HatDecorator {
	IHat hat;
	
	public SilverRibbon(IHat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public double getPrice() {
		
		return 100+hat.getPrice();
	}
}
