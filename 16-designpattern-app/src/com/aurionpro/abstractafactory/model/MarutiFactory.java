package com.aurionpro.abstractafactory.model;

public class MarutiFactory implements ICarFactory{

	@Override
	public ICar makeCar() {
		 ICar car =  new Maruti();
		return car;
	}

}
