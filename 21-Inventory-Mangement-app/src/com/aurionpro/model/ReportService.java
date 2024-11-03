package com.aurionpro.model;

import java.util.Map;

public class ReportService {
	 public void displayTotalProducts(InventoryService inventory) {
		 Map<Integer, Product> inventory1 = inventory.getInventory(); 
	        int totalProducts = inventory1.size();
	        System.out.println("Total number of products: " + totalProducts);
	    }

	    public void displayTotalStockValue(InventoryService inventory) {
	    	 Map<Integer, Product> inventory1 = inventory.getInventory(); 
	        double totalStockValue = inventory1.values().stream()
	                .mapToDouble(product -> product.getQuantity() * product.getPrice())
	                .sum();
	        System.out.printf("Total stock value: %.2f%n", totalStockValue);
	    }

	    public void displayLowStockProducts(InventoryService inventory, int threshold ) {
	    	 Map<Integer, Product> inventory1 = inventory.getInventory(); 
	        System.out.println("Low stock products (threshold: " + threshold + "):");
	        inventory1.values().stream()
	                .filter(product -> product.getQuantity() < threshold)
	                .forEach(product -> System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Quantity: " + product.getQuantity()));
	    }

	    public void displayReport(InventoryService inventory, int threshold) {
	        displayTotalProducts(inventory);
	        displayTotalStockValue(inventory);
	        displayLowStockProducts(inventory, 5); 
	    }
}
