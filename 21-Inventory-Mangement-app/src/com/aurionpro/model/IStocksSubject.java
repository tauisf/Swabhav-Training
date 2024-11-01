package com.aurionpro.model;

public interface IStocksSubject{
	    void registerObserver(IStockObserver observer);
	    void removeObserver(IStockObserver observer);
	    void notifyObservers(int productId, int newQuantity);
}
