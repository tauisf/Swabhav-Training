package com.aurionpro.test;

import com.aurionpro.model.ContactService;

public class FacadeContactApp {

	public static void main(String[] args) {
		ContactService service = new ContactService();
		
		service.addUserDetails();
		service.manageContactsApp();
		

	}

}
