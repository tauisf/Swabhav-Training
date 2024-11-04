package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.aurionpro.exception.InsufficientStockException;
import com.aurionpro.exception.InventoryException;
import com.aurionpro.exception.NegativeException;
import com.aurionpro.exception.NotFoundException;
import com.aurionpro.exception.OrderException;
import com.aurionpro.exception.ProductExistException;
import com.aurionpro.exception.SuppilerNotFoundException;

public class InventoryManageService {
	private static Scanner scanner = new Scanner(System.in);
	public static List<Order> orders = new ArrayList<>();
	private static InventoryServiceImp inventory = InventoryServiceImp.createInventory();
	private static OrderService orderService = new OrderService();
	private static ReportService report = new ReportService();
	private static StockTransaction stockTransaction;

	public static void ManageInventory() {

		boolean exit = false;

		while (!exit) {
			mainDisplayMenu();
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				productManagementMenu();
				break;
			case 2:
				supplierManagementMenu();
				break;
			case 3:
				transactionManagementMenu();
				break;
			case 4:
				generateReports();
				break;

			case 5:
				System.out.println("Exiting...");
				exit = true;
				break;
			default:
				System.out.println("Invalid option. Please try again.");
			}

		}
	}

	private static void mainDisplayMenu() {
		System.out.println("Menu:");
		System.out.println("1. Product Management");
		System.out.println("2. Supplier Management");
		System.out.println("3. Transaction Management");
		System.out.println("4. Generate Reports");
		System.out.println("5. Exit");
		System.out.print("Enter your choice: ");

	}

	private static void productManagementMenu() {
		boolean productOperation = true;

		while (productOperation) {
			int choice;
			System.out.println("Product Management:");
			System.out.println("1. Add Product");
			System.out.println("2. Remove Product ");
			System.out.println("3. View All Products");
			System.out.println("4. Update Product");
			System.out.println("5. View  Product ");
			System.out.println("6. Back to Main Menu");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				addItem(inventory);
				break;
			case 2:
				removeItem(inventory);
				break;
			case 3:
				inventory.loadProductsFromFile();
				break;

			case 4:
				updateProduct(inventory);
				break;
			case 5:
				viewProductById(inventory);
				break;
				
			case 6:
				productOperation = false;
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void viewProductById(InventoryServiceImp inventory2) {
		try {
		inventory.viewProductId();
		
		System.out.print("Enter Product ID to view : ");

		int productId = scanner.nextInt();
		if (inventory.getProductById(productId) == null) {
			System.out.println("Product do not exist");
			return;
		}
		System.out.println(inventory.getProductById(productId));
		}catch(NotFoundException e) {
			System.out.println(e.getMessage()+"  Product donot Exist ");
		}
		
	}

	private static void updateProduct(InventoryService inventory) {

		System.out.print("Enter the product id to update: ");
		int productId = scanner.nextInt();
		inventory.updateProduct(productId);
	}

	private static void supplierManagementMenu() {
		int choice;
		do {
			System.out.println("Supplier Management:");
			System.out.println("1. Add Supplier");
			System.out.println("2. Update Supplier");
			System.out.println("3. Delete Supplier");
			System.out.println("4. View Supplier Details");
			System.out.println("5. View All Suppliers");
			System.out.println("6. Back to Main Menu");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				addSupplier();
				break;
			case 2:
				updateSupplier();
				break;
			case 3:
				deleteSupplier();
				break;
			case 4:
				viewSupplierDetails(scanner, inventory);
				break;
			case 5:
				inventory.getAllSuppliers();
				break;
			case 6:
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 6);
	}

	// Order
	private static void transactionManagementMenu() {
		int choice;
		do {
			System.out.println("Transaction Management:");
			System.out.println("1. Update Stock");
			System.out.println("2. View Transaction History");
			System.out.println("3. Place Order");
			System.out.println("4. View Order ");
			System.out.println("5. Back to Main Menu");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				try {
					updateStocks(inventory);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				break;

			case 2:
				viewTransaction(inventory);
				break;
			case 3:
				try {
					placeOrder(scanner, orderService, inventory);
				} catch (OrderException e) {
					System.out.println(e.getMessage());

				}
				break;
			case 4:
				viewOrder(orders);
				break;

			case 5:
				
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 5);
	}

	private static void viewSupplierDetails(Scanner scanner, InventoryServiceImp inventory) {

		inventory.viewSupplierbyId();
		System.out.print("Enter Supplier ID to view : ");

		int supplierId = scanner.nextInt();
		if (inventory.getSupplierById(supplierId) == null) {
			System.out.println("Suppiler do not exist");
			return;
		}
		System.out.println(inventory.getSupplierById(supplierId));

	}

	private static void deleteSupplier() {
		System.out.print("Enter Supplier ID to delete  : ");

		int supplierId = scanner.nextInt();
		inventory.removeSupplier(supplierId);
	}

	private static void updateSupplier() {
		System.out.print("Enter the Supplier ID to update: ");
		int supplierId = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter new name (leave blank to keep current): ");
		String newName = scanner.nextLine().trim();

		System.out.print("Enter new contact information (leave blank to keep current): ");
		String newContactInfo = scanner.nextLine().trim();

		try {
			inventory.updateSupplier(supplierId, newName.isEmpty() ? null : newName,
					newContactInfo.isEmpty() ? null : newContactInfo);
			System.out.println("Supplier updated successfully.");
		} catch (SuppilerNotFoundException e) {
			System.err.println("Error updating supplier: " + e.getMessage());
		}

	}

	private static void addSupplier() {
		System.out.print("Enter Supplier ID: ");
		int supplierId = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter Supplier Name: ");
		String name = scanner.nextLine().trim();

		System.out.print("Enter Supplier Contact Information: ");
		String contactInfo = scanner.nextLine().trim();

		inventory.addSupplier(new Suppiler(supplierId, name, contactInfo));

	}

	private static void generateReports() {

		report.displayReport(inventory, 5);
	}

	private static void addItem(InventoryService inventory) {
		try {
			System.out.print("Enter Item ID: ");
			int id = scanner.nextInt();
			System.out.print("Enter Item Name: ");
			String name = scanner.next();
			System.out.print("Enter Price: ");
			double price = scanner.nextDouble();
			System.out.print("Enter Quantity: ");
			int quantity = scanner.nextInt();

			Product product = PorductFactory.createProduct(id, name, price, quantity);
			Command addCommand = new AddProductCommand(inventory, product);
			addCommand.execute();
		} catch (ProductExistException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void removeItem(InventoryService inventory) {

		System.out.print("Enter Item ID to remove: ");

		int removeId = scanner.nextInt();
		inventory.removeProduct(removeId);

	}

	private static void placeOrder(Scanner scanner, OrderService orderService, InventoryService inventory)
			throws OrderException {

		System.out.print("Enter Customer ID to order: ");
		String customerId = scanner.next();

		boolean ordering = true;
		while (ordering) {
			System.out.print("1. Add Product to Order\n2. Place the Order\nChoose an option: ");
			int addChoice = scanner.nextInt();
			scanner.nextLine();

			switch (addChoice) {
			case 1:
				addProductToOrder(orderService, inventory);
				break;
			case 2:
				Order placedOrder = orderService.placeOrder(customerId, orderService.getProducts());

				if (placedOrder == null) {
					System.out.println("------Nothing is added to order");
					break;
				}
				System.out.println("------Order placed succefully");
				inventory.saveProductsToFile();
				orders.add(placedOrder);
				ordering = false;
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void addProductToOrder(OrderService orderService, InventoryService inventory) {

		try {
			System.out.print("Enter Product ID to order: ");
			int orderId = scanner.nextInt();
			System.out.print("Enter the qauntity: ");
			int quantity = scanner.nextInt();

			Product orderItem = inventory.getProductById(orderId);
			orderService.addProductToOrder(orderItem, quantity);

		} catch (InventoryException e) {
			System.out.println(e.getMessage());
		} catch (NegativeException e) {
			System.out.println(e.getMessage());
		} catch (InsufficientStockException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void viewOrder(List<Order> orders) {
		if (orders.isEmpty()) {
			System.out.println("No Order Place! ");
			return;
		}
		System.out.println("Select an order to view :");
		for (Order order : orders) {
			System.out.println("Order ID: " + order.getOrderId());
		}
		System.out.println("Enter Order ID to view :");
		int selectedOrderId = scanner.nextInt();

		Order selectedOrder = null;
		for (Order order : orders) {
			if (order.getOrderId() == selectedOrderId) {
				selectedOrder = order;
				break;
			}
		}

		if (selectedOrder == null) {
			System.out.println("Invalid Order ID.");
			return;
		}

		for (Order order : orders) {
			for (Product product : order.getProducts()) {
				System.out.println(product.getId() + "--- " + product.getName() + "--- " + product.getQuantity()
						+ "--- " + product.getPrice());
			}
		}

	}

	private static void updateStocks(InventoryService inventory) throws InterruptedException {

		System.out.println("Enter the product id ");
		int productId = scanner.nextInt();
		System.out.println("Enter the Quantity ");
		int quantity = scanner.nextInt();
		if (quantity < 0) {
			System.out.println("Quantity cannot be negative");
			return;
		}

		System.out.println("1.Add Stocks 2.Remove Stocks");
		int chocie = scanner.nextInt();
		try {
			if (chocie == 1) {
				stockTransaction = new StockTransaction(inventory, productId, quantity, true);
				stockTransaction.getThread().join();
			} else {
				stockTransaction = new StockTransaction(inventory, productId, quantity, false);
				stockTransaction.getThread().join();
			}
		} catch (NegativeException e) {
			System.out.println(e.getMessage());
		} catch (InsufficientStockException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void viewTransaction(InventoryServiceImp inventory) {
		inventory.viewTransaction();

	}

}