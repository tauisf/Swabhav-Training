package com.aurionpro.facade.hotel.model;

public class IndianHotel implements IHotel {

	@Override
	public IMenu getMenu() {
		
		return  new IndianMenu();
	}


}
