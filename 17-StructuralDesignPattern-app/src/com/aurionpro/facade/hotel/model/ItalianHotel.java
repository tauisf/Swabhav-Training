package com.aurionpro.facade.hotel.model;

public class ItalianHotel  implements IHotel{

	@Override
	public IMenu getMenu() {
		
		return new ItalianMenu();
	}

}
