package com.aurionpro.model;

import java.io.*;

import java.util.*;

import java.util.stream.Collectors;

import com.aurionpro.exception.InsufficientStockException;
import com.aurionpro.exception.InventoryException;
import com.aurionpro.exception.NegativeException;
import com.aurionpro.exception.NotFoundException;
import com.aurionpro.exception.ProductExistException;
import com.aurionpro.exception.StockTranscationException;
import com.aurionpro.exception.SuppilerNotFoundException;

public class InventoryServiceImp implements InventoryService, IStocksSubject {
	Scanner scanner = new Scanner(System.in);

	private static InventoryServiceImp inventoryServiceImp;

	private StockManager stockManager = new StockManager();
	private DataSaver saveData = new DataSaver();
	private static DataLoader loadData = new DataLoader();
	private static Transaction transaction;

	private static final String FILENAME = "products.dat";
	private static Map<Integer, Product> inventory = new HashMap<>();
	private static final String SUPPLIER_FILENAME = "supplier.dat";
	private Map<Integer, Suppiler> suppliers = new HashMap<>();
	private static final String TRANSACTION_FILENAME = "transaction.dat";
	private static  Map<Integer, Transaction> transactions = new HashMap<>();

	private InventoryServiceImp() {
		initializeInventory();

	}

	public Map<Integer, Product> getInventory() {
		return new HashMap<>(inventory);
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

	@Override
	public void addProduct(Product product) throws InventoryException {
		if (inventory.values().stream().anyMatch(p -> p.getId() == product.getId())) {
			throw new ProductExistException(product.getId());
		}
		inventory.put(product.getId(), product);
		try {
			saveData.saveProducts(inventory, FILENAME);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeProduct(int id) {

		Product removedProduct = inventory.remove(id);
		if (removedProduct != null) {
			System.out.println("Product with ID " + id + " has been removed from inventory.");
			try {
				saveData.saveProducts(inventory, FILENAME);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Product not found with ID: " + id);
		}

	}

	// update product
	@Override
	public void updateProduct(int productId) throws InventoryException {
		Product product = getProductById(productId);

		System.out.println("Updating product: " + product.getName());

		System.out.print("Enter new name (leave blank to keep current): ");
		String newName = scanner.nextLine().trim();
		if (!newName.isEmpty()) {
			product.setName(newName);
		}

		System.out.print("Enter new price (enter -1 to keep current): ");
		double newPrice = scanner.nextDouble();
		if (newPrice >= 0) {
			product.setPrice(newPrice);
		}

		System.out.print("Enter new quantity (enter -1 to keep current): ");
		int newQuantity = scanner.nextInt();
		if (newQuantity >= 0) {
			product.setQuantity(newQuantity);
		}

		System.out.println("Product updated successfully: " + product);

		try {
			saveData.saveProducts(inventory, FILENAME);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// get Product by id
	@Override
	public Product getProductById(int id) {
		String idString = Integer.toString(id);
		
		return inventory.values().stream().filter(product -> product.getId() == id).findFirst()
				.orElseThrow(() -> new NotFoundException() );
	}
	
	public void viewProductId() {
		if(inventory.isEmpty()) {
			System.out.println("No Product to view");
			return;
		}
		for(Map.Entry<Integer, Product> product : inventory.entrySet())
			System.out.println("Product-id: "+product.getKey());
	}

	// Update Stock
	@Override
	public synchronized void updateStock(int productId, int quantity) throws StockTranscationException {
		Product product = getProductById(productId);

		if (quantity > 0) {
			product.setQuantity(product.getQuantity() + quantity);
			transaction = new Transaction(product.getId(), "Added", quantity);
			transactions.put(transaction.getTransactionId(), transaction);
			
			System.out.println(
					quantity + " units added to product " + productId + ". New quantity: " + product.getQuantity());

		} else {
			int absQuantity = Math.abs(quantity);
			if (product.getQuantity() < absQuantity) {
				throw new InsufficientStockException();

			}
			product.setQuantity(product.getQuantity() - absQuantity);
			transaction = new Transaction(product.getId(), "Removed", absQuantity);
			transactions.put(transaction.getTransactionId(), transaction);
			System.out.println(absQuantity + " units removed from product " + productId + ". New quantity: "
					+ product.getQuantity());

		}
		try {
			saveData.saveTransaction(transactions, TRANSACTION_FILENAME);
			saveData.saveProducts(inventory, FILENAME);
		} catch (IOException e) {

			e.printStackTrace();
		}
		stockManager.notifyObservers(productId, product.getQuantity());
	}

	@Override
	public void saveProductsToFile() {
		try {
			saveData.saveProducts(inventory, FILENAME);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void loadProductsFromFile() {
		try {
			loadData.loadProducts(FILENAME);
		} catch (ClassNotFoundException | IOException e) {

			e.printStackTrace();
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

	// Add a Supplier
	public void addSupplier(Suppiler supplier) {
		suppliers.put(supplier.getSupplierId(), supplier);
		try {
			saveData.saveSuppliers(suppliers, SUPPLIER_FILENAME);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Delete or remove a Supplier
	public void removeSupplier(int id) {

		Suppiler removeSupplier = suppliers.remove(id);
		if (removeSupplier != null) {
			System.out.println("Supplier with ID " + id + " has been removed from inventory.");
			try {
				saveData.saveSuppliers(suppliers, SUPPLIER_FILENAME);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Supplier not found with ID: " + id);
		}

	}

	// Update a Supplier
	public void updateSupplier(int supplierId, String newName, String newContactInfo) {
		Suppiler supplier = suppliers.get(supplierId);
		if (supplier != null) {
			supplier.setName(newName);
			supplier.setContactInfo(newContactInfo);
			try {
				saveData.saveSuppliers(suppliers, SUPPLIER_FILENAME);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			throw new SuppilerNotFoundException();
		}
	}
  
	public void viewSupplierbyId() {
		if(suppliers.isEmpty()) {
			System.out.println("No Supplie to view");
			return;
		}
		for(Map.Entry<Integer, Suppiler> supplier : suppliers.entrySet())
			System.out.println("Supplier-id: "+supplier.getKey());
	}
	
	// View A Supplier
	public Suppiler getSupplierById(int supplierId) {
		
		return suppliers.get(supplierId);

	}

	// View all suppliers
	public void getAllSuppliers() {
		if (suppliers.isEmpty()) {
			System.out.println("-----------No Supplier is Performed: ");
			return;
		}
		try {
			loadData.loadSuppliers(SUPPLIER_FILENAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void viewTransaction() {
		if (transactions.isEmpty()) {
			System.out.println("----------No transaction is done: ");
			return;
		}
		try {
			loadData.loadTransaction(TRANSACTION_FILENAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
