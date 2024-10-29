package com.aurionpro.decorator.hat.model;

public abstract class HatDecorator implements IHat {
	IHat hat;
	@Override
	public abstract double getPrice();
	

}
