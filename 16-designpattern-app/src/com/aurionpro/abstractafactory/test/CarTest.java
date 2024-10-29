package com.aurionpro.abstractafactory.test;

import com.aurionpro.abstractafactory.model.ICar;
import com.aurionpro.abstractafactory.model.ICarFactory;
import com.aurionpro.abstractafactory.model.MahindraFactory;

public class CarTest {

	public static void main(String[] args) {
	
		ICarFactory factory = new  MahindraFactory();
		
		ICar car = factory.makeCar();
		
		
		car.start();
		car.stop();
		
		

	}

}
