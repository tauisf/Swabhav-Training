package com.aurionrpro.factory.test;

import com.aurionrpro.factory.model.ICarFactory;
import com.aurionrpro.factory.model.CarType;
import com.aurionrpro.factory.model.ICar;

public class CarTest {

	public static void main(String[] args) {
	ICar car;
	
		car = ICarFactory.makeCar(CarType.mahindra);
		car.start();
		car.stop();
		
		car = ICarFactory.makeCar(CarType.tata);
		car.start();
		car.stop();
		
		
		car = ICarFactory.makeCar(CarType.maruti);
		car.start();
		car.stop();
		
		

	}

}
