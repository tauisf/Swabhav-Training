package com.aurionpro.model;

import java.util.List;

import com.aurionpro.exception.InventoryException;

public interface InventoryService {
	public void addProduct(Product product) throws InventoryException ;
	public Product getProductById(int id)throws InventoryException ;
    public void updateStock(int productId)throws InventoryException;
    public void removeProduct(int id);
    public void saveProductsToFile();
    public void loadProductsFromFile();
  
    public  List<Product> getLowStockProducts(int threshold);
}
