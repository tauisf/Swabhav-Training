package com.aurionpro.facade.hotel.model;

public class HotelService {

	public void getIndianMenu() {
		IHotel indHotel = new IndianHotel();
		IMenu indMenu =indHotel.getMenu();
		indMenu.displayMenu();
	}
	
	public void getItalianMenu() {
		IHotel indHotel = new ItalianHotel();
		IMenu indMenu =indHotel.getMenu();
		indMenu.displayMenu();
	}
}
