package com.aurionpro.decorator.hat.model;

public class GoldenRibbon extends HatDecorator{
	IHat hat;
	
	public GoldenRibbon(IHat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public double getPrice() {
		
		return 500+hat.getPrice();
	}

}
