package com.aurionpro.model;

import java.util.List;
import java.util.Map;

import com.aurionpro.exception.InventoryException;
import com.aurionpro.exception.StockTranscationException;

public interface InventoryService {
	//Product 
	public void addProduct(Product product) throws InventoryException ;
	public Product getProductById(int id)throws InventoryException ;
    public void updateProduct(int productId) throws InventoryException ;
    public void removeProduct(int id);
	public Map<Integer, Product> getInventory();
	
	//Supplier
	public void addSupplier(Suppiler supplier);
	public void removeSupplier(int id) ;
	public void updateSupplier(int supplierId, String newName, String newContactInfo);
	public Suppiler getSupplierById(int supplierId);
	 public void  getAllSuppliers() ;
	
	//transaction
	 public void updateStock(int productId,int quantity)throws StockTranscationException;
	
	public void saveProductsToFile();
    public void loadProductsFromFile();
}
