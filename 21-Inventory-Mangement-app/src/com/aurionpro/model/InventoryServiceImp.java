package com.aurionpro.model;

import java.io.*;

import java.util.*;

import java.util.stream.Collectors;

import com.aurionpro.exception.InsufficientStockException;
import com.aurionpro.exception.InventoryException;
import com.aurionpro.exception.NegativeException;
import com.aurionpro.exception.ProductExistException;

public class InventoryServiceImp implements InventoryService, IStocksSubject {
	Scanner scanner = new Scanner(System.in);

	private static InventoryServiceImp inventoryServiceImp;
	private static Map<Integer, Product> inventory = new HashMap<>();
	private StockManager stockManager = new StockManager();
	private static final String FILENAME = "products.dat";

	private InventoryServiceImp() {
		initializeInventory();

	}

	public static InventoryServiceImp createInventory() {
		if (inventoryServiceImp == null)
			inventoryServiceImp = new InventoryServiceImp();
		return inventoryServiceImp;
	}

	private void initializeInventory() {
		addProduct(PorductFactory.createProduct(10, "Laptop", 100000, 10));
		addProduct(PorductFactory.createProduct(11, "Washing Machine", 23000, 10));
		addProduct(PorductFactory.createProduct(12, "Phone", 34000, 10));
		registerObserver(new StockAlertSystem(5));
		registerObserver(new StockLogger());
	}

	public void addProduct(Product product) throws InventoryException {
		if (inventory.values().stream().anyMatch(p -> p.getId() == product.getId())) {
			throw new ProductExistException(product.getId());
		}
		inventory.put(product.getId(), product);
		saveProductsToFile();
	}

	@Override
	public void removeProduct(int id) {

		Product removedProduct = inventory.remove(id);
		if (removedProduct != null) {
			System.out.println("Product with ID " + id + " has been removed from inventory.");
			saveProductsToFile();
		} else {
			System.out.println("Product not found with ID: " + id);
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
			System.out.println(
					quantity + " units added to product " + productId + ". New quantity: " + product.getQuantity());

		} else {

			if (product.getQuantity() < quantity) {
				throw new InsufficientStockException();

			}
			product.setQuantity(product.getQuantity() - quantity);

			System.out.println(
					quantity + " units removed from product " + productId + ". New quantity: " + product.getQuantity());

		}
		saveProductsToFile();
		stockManager.notifyObservers(productId, product.getQuantity());
	}

	@Override
	public List<Product> getLowStockProducts(int threshold) {

		return inventory.values().stream().filter(product -> product.getQuantity() < threshold)
				.collect(Collectors.toList());
	}
	
	
	@Override
	public void saveProductsToFile() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
			oos.writeObject(new ArrayList<>(inventory.values()));
			System.out.println("Product are save to the file");

		} catch (IOException e) {
			System.err.println("Error saving products: " + e.getMessage());
		}

	}
	@Override
	public void loadProductsFromFile() {
		File file = new File(FILENAME);
		if (!file.exists())
			return;

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			
			List<Product> products = (List<Product>) ois.readObject();
			System.out.println("----- porduct in inventroy ------");
			for (Product product : products) {
				// inventory.put(product.getId(), product);
				System.out.println(product.getId() + " " + product.getName() + " " + product.getQuantity());
			}
			System.out.println("----------------------");
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("Error loading products: " + e.getMessage());
		}
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
