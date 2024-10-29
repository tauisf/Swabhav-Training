package com.aurionpro.facade.hotel.test;

import com.aurionpro.facade.hotel.model.HotelService;


public class HotelTest {

	public static void main(String[] args) {
		HotelService service = new HotelService();
		
		service.getIndianMenu();
		service.getItalianMenu();
	}

}
