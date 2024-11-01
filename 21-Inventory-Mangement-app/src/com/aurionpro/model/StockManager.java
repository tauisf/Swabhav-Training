package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class StockManager  implements IStocksSubject{
	private List<IStockObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(IStockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IStockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int productId, int newQuantity) {
        for (IStockObserver observer : observers) {
            observer.update(productId, newQuantity);
        }
    }


	

}
