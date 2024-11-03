package com.aurionpro.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataSaver {
	 public void saveProducts(Map<Integer, Product> inventory, String filename) throws IOException {
	        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
	        	out.writeObject(new ArrayList<>(inventory.values()));
	        	System.out.println("Product are save to the file: "+filename);
	        }
	    }

	    public void saveSuppliers(Map<Integer,Suppiler> suppliers, String filename) throws IOException {
	        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
	        	out.writeObject(new ArrayList<>(suppliers.values()));
	        	System.out.println("Supplier  are save to the file: "+filename);
	        }
	    }
	    public void saveTransaction(Map<Integer,Transaction> transactions, String filename) throws IOException {
	        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
	        	out.writeObject(new ArrayList<>(transactions.values()));
	        	System.out.println("Transactions  are save to the file: "+filename);
	        }
	    }
}
