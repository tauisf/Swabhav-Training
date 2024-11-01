package com.aurionpro.model;

public class RemoveCommand implements Command {
    private InventoryService inventoryService;
    private int productId;

    
    
	public RemoveCommand(InventoryService inventoryService, int productId) {
		super();
		this.inventoryService = inventoryService;
		this.productId = productId;
	}



	@Override
	public void execute() {
		inventoryService.removeProduct(productId);
		
	}

}
