package com.aurionpro.decorator.model;

public class WheelAlignment extends CarServiceDecortaor{

	
	ICarService service;
	
	public WheelAlignment(ICarService service) {
		super();
		this.service = service;
	}

	@Override
	public double getCost() {
		
		return 1500+service.getCost();
	}

}