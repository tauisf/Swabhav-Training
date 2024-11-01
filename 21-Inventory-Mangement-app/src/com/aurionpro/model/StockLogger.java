package com.aurionpro.model;

public class StockLogger implements IStockObserver{

	@Override
	public void update(int productId, int newQuantity) {
		 System.out.println("Logger: Product ID " + productId + " updated to " + newQuantity + " units.");
		
	}

}
