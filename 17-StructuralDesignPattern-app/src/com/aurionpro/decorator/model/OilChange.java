package com.aurionpro.decorator.model;

public class OilChange extends CarServiceDecortaor{
	
	ICarService carService;
	

	public OilChange(ICarService carService) {
		super();
		this.carService = carService;
	}


	@Override
	public double getCost() {
		
		return 500+carService.getCost();
	}

}
