package com.aurionpro.model;

public class StockAlertSystem implements IStockObserver{
	 private int threshold;

	    public StockAlertSystem(int threshold) {
	        this.threshold = threshold;
	    }

	@Override
	public void update(int productId, int newQuantity) {
		  if (newQuantity < threshold) {
	            System.out.println("Alert: Product ID " + productId + " is low on stock! Only " + newQuantity + " units left.");
	        }
		
	}

}
