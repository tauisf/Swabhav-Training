package com.aurionpro.model;

import com.aurionpro.exception.InventoryException;

public class AddProductCommand implements Command{
	 private InventoryService inventoryService;
	 private Product product;
	 

	public AddProductCommand(InventoryService inventoryService, Product product) {
		super();
		this.inventoryService = inventoryService;
		this.product = product;
	}


	@Override
	public void execute() {
		try {
			inventoryService.addProduct(product);
		} catch (InventoryException e) {
			System.out.println("Can't add the product");
			
		}
	}

}
