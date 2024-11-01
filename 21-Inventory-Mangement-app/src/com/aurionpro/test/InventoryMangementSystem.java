package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exception.OrderException;
import com.aurionpro.model.InventoryManageService;


public class InventoryMangementSystem {

    public static void main(String[] args) throws  OrderException {
       

    	InventoryManageService manageInventory = new InventoryManageService();
    	manageInventory.ManageInventory();
    	manageInventory.displayMenu();
    	
    }
}

