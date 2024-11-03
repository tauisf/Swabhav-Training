package com.aurionpro.model;

import com.aurionpro.exception.InsufficientStockException;
import com.aurionpro.exception.StockTranscationException;

public class StockTransaction implements Runnable{
	    private Thread thread;
	    private InventoryService inventoryService;
	    private int productId;
	    private int quantity;
	    private boolean isAdding;

	    public StockTransaction(InventoryService inventoryService, int productId, int quantity, boolean isAdding) {
	        this.thread = new Thread(this);
	    	this.inventoryService = inventoryService;
	        this.productId = productId;
	        this.quantity = quantity;
	        this.isAdding = isAdding;
	        thread.start();
	    }

	    @Override
	    public void run() {
	        try {
	            if (isAdding) {
	                System.out.println("Adding stock for Product ID: " + productId + ", Quantity: " + quantity);
	                inventoryService.updateStock(productId, quantity);
	            } else {
	                System.out.println("Removing stock for Product ID: " + productId + ", Quantity: " + quantity);
	                inventoryService.updateStock(productId, -quantity);
	            }
	        } catch (StockTranscationException e) {
	            System.err.println("Error during stock transaction: " + e.getMessage());
	        }catch(InsufficientStockException e) {
	        	 System.err.println("Error during stock transaction: " + e.getMessage());
	        }
	    }

		public Thread getThread() {
			return thread;
		}
	    
	    
	}

