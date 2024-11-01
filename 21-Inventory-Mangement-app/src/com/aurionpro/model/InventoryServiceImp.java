package com.aurionpro.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import com.aurionpro.exception.InsufficientStockException;
import com.aurionpro.exception.InventoryException;
import com.aurionpro.exception.NegativeException;

public class InventoryServiceImp implements InventoryService, IStocksSubject {
	Scanner scanner = new Scanner(System.in);

	private static InventoryServiceImp inventoryServiceImp;
	private static Map<Integer, Product> inventory = new HashMap<>();
	private StockManager stockManager = new StockManager();

	private  InventoryServiceImp() {
		Product product;
		product = PorductFactory.createProduct(010, "Laptop", 100000, 10);
		inventory.put(product.getId(), product);
		product = PorductFactory.createProduct(011, "Washing-Machine", 23000, 10);
		inventory.put(product.getId(), product);
		product = PorductFactory.createProduct(012, "Phone", 34000, 10);
		inventory.put(product.getId(), product);
        
		
		registerObserver(new StockAlertSystem(5));
		registerObserver(new StockLogger());
		
	}
	
	public  static InventoryServiceImp createInventory() {
		if(inventoryServiceImp == null) 
			  inventoryServiceImp = new InventoryServiceImp();
		return inventoryServiceImp;
	}

	public void addProduct(Product product) throws InventoryException {
		if (inventory.containsKey(product.getId())) {
			throw new InventoryException();
		}
		inventory.put(product.getId(), product);

	}

	@Override
	public void removeProduct(int id) {

		Product removedProduct = inventory.remove(id);
		if (removedProduct != null) {
			System.out.println("Product with ID " + id + " has been removed from inventory.");
		} else {
			System.out.println("Product not found with ID: " + id);
		}
		
	}

	public void viewProducts() {
		System.out.println("Current Products:");
		if (inventory.isEmpty()) {
			System.out.println("No products in inventory.");
			return;
		}

		Set<Entry<Integer, Product>> productSet = inventory.entrySet();
		for (Entry<Integer, Product> entry : productSet) {
			Integer productId = entry.getKey();
			Product product = entry.getValue();

			System.out.println("Product ID: " + productId + " -- " + product.getName() + " -- " + product.getQuantity()
					+ " --" + product.getPrice());
		}

	}

	@Override
	public Product getProductById(int id) throws InventoryException {
		String idString = Integer.toString(id);
		return inventory.values().stream().filter(product -> product.getId() == id).findFirst()
				.orElseThrow(() -> new InventoryException());
	}

	@Override
	public void updateStock(int productId) throws InventoryException {
		Product product = getProductById(productId);
		System.out.println("Enter The Quantity ");
		int quantity = scanner.nextInt();

		System.out.println("1.To Add Quantity 2. To Remove Quantity");
		int choice = scanner.nextInt();

		if (choice == 1) {

			if (quantity <= 0) {
				throw new NegativeException();
			}

			product.setQuantity(product.getQuantity() + quantity);
			System.out.println(quantity + " units added to product " + productId + ". New quantity: " + product.getQuantity());

		}else {

		
			if (product.getQuantity() < quantity) {
				throw new InsufficientStockException();
	
			}
		   product.setQuantity(product.getQuantity() - quantity);

		System.out.println(quantity + " units removed from product " + productId + ". New quantity: " + product.getQuantity());
		
		}
		
		stockManager.notifyObservers(productId, product.getQuantity());
	}

	@Override
	public List<Product> getLowStockProducts(int threshold) {
		return inventory.values().stream().filter(product -> product.getQuantity() < threshold)
				.collect(Collectors.toList());
	}

	@Override
	public void registerObserver(IStockObserver observer) {

		stockManager.registerObserver(observer);
		
	}

	@Override
	public void removeObserver(IStockObserver observer) {

		stockManager.removeObserver(observer);
	}

	@Override
	public void notifyObservers(int productId, int newQuantity) {
		stockManager.notifyObservers(productId, newQuantity);
	}

}
