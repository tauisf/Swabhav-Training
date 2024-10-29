package com.aurionrpro.factory.model;

public   class ICarFactory {

	private  static ICar car;
	
	public static ICar makeCar(CarType type) {
		
		if(type ==  CarType.mahindra)
			car = new Mahindra();
		if(type ==  CarType.tata)
			car = new Tata();
		if(type ==  CarType.maruti)
			car = new Maruti();
		return car;
	}
}
