package com.aurionpro.decorator.model;

public class CarService {

	public ICarService startService() {

		ICarService carService = new CarInspectionService();

		return carService;

	}

	public ICarService getOilChange(ICarService carService) {

		ICarService oilService = new OilChange(carService);
		return oilService;
	}

	public ICarService getWheelALign(ICarService carService) {

		ICarService wheelService = new WheelAlignment(carService);
		return wheelService;

	}

}
