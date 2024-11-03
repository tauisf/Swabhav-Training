package com.aurionpro.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DataLoader {
	  
	    public void  loadProducts(String filename) throws IOException, ClassNotFoundException {
	    	 File file = new File(filename);
	    	    if (!file.exists()) return;

	    	    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
	    	        List<Product> products = (List<Product>) ois.readObject(); 
	    	        for (Product product : products) {
	    	            System.out.println("Product-id: "+product.getId()
	    	            					+" Porduct-Name: "+product.getName()
	    	            					+" Product-Quantity: "+product.getQuantity()
	    	            					+" Product-Price (Each): "+product.getPrice());
	    	        }
	    	        System.out.println("Product loaded from file.");
	    	    } catch (IOException | ClassNotFoundException e) {
	    	        System.err.println("Error loading products: " + e.getMessage());
	    	    }
	    }

	    public void loadSuppliers(String filename) throws IOException, ClassNotFoundException {
	    	File file = new File(filename);
    	    if (!file.exists()) return;

    	    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
    	        List<Suppiler> suppliers = (List<Suppiler>) ois.readObject();  
    	        for (Suppiler supplier : suppliers) {
    	            System.out.println("Supplier-id: "+supplier.getSupplierId()
    	            					+" Supplier-Name:"+supplier.getName()
    	            					+" ContactType: "+supplier.getContactInfo());
    	        }
    	        System.out.println("Suppliers loaded from file.");
    	    } catch (IOException | ClassNotFoundException e) {
    	        System.err.println("Error loading products: " + e.getMessage());
    	    }
	    }

	    public void loadTransaction(String filename) throws IOException, ClassNotFoundException {
	    	File file = new File(filename);
    	    if (!file.exists()) return;

    	    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
    	        List<Transaction> transactions = (List<Transaction>) ois.readObject();  
    	        for (Transaction transaction : transactions) {
    	            System.out.println("Transaction: "+transaction.getTransactionId()
    	            				+" Product Id:"+transaction.getProductId()
    	            				+" Type: "+transaction.getType()
    	            				+" Quantity: "+transaction.getQuantity()
    	            				+" Time: "+transaction.getDate());
    	        }
    	        System.out.println("Transaction loaded from file.");
    	    } catch (IOException | ClassNotFoundException e) {
    	        System.err.println("Error loading products: " + e.getMessage());
    	    }
	    }

}
