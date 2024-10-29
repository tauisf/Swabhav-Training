package com.aurionpro.decorator.test;

import com.aurionpro.decorator.model.CarService;
import com.aurionpro.decorator.model.ICarService;

public class CarApp {
		public static void main(String[] args) {
			
			CarService service = new CarService();
			
			ICarService  carService =service.startService();
			
			 carService = service.getOilChange(carService);
			 
			 carService = 	service.getWheelALign(carService);
			System.out.println(carService.getCost()); 	
		}

}
