package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.exception.InsufficientStockException;
import com.aurionpro.exception.InventoryException;
import com.aurionpro.exception.NegativeException;
import com.aurionpro.exception.OrderException;

public class InventoryManageService {
	public static List<Order> orders = new ArrayList<>();
	public static void ManageInventory() {
		 InventoryService inventory = InventoryServiceImp.createInventory();
	        OrderService orderService = new OrderService();
	        Scanner scanner = new Scanner(System.in);
	        

	        while (true) {
	            displayMenu();
	            int choice = getUserChoice(scanner);

	            switch (choice) {
	                case 1:
	                    addItem(scanner, inventory);
	                    break;
	                case 2:
	                    removeItem(scanner, inventory);
	                    break;
	                case 3:
	                    inventory.viewProducts();
	                    break;
	                case 4:
					try {
						placeOrder(scanner, orderService, inventory);
					} catch (OrderException e) {
						System.out.println(e.getMessage());
						
					}
	                    break;
	                case 5:
	                   updateStocks(scanner ,inventory);
	                    break;
	                case 6:
		                   viewOrder(scanner,orders);
		                    break;
	                case 7:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }
	    }
	

    private static void viewOrder(Scanner scanner,List<Order> orders) {
    	if(orders.isEmpty()) {
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
	    for (Order order :orders) {
	        if (order.getOrderId() == selectedOrderId) {
	            selectedOrder = order;
	            break;
	        }
	    }

	    if (selectedOrder == null) {
	        System.out.println("Invalid Order ID.");
	        return;
	    }
	    
	    for (Order order :orders) {
	    	for(Product product: order.getProducts()) {
	    		System.out.println(product.getId()
	    				+"--- "+product.getName()
	    				+"--- "+product.getQuantity()
	    				+"--- "+product.getPrice());
	    	}
	    }
		
	}


	public  static void updateStocks(Scanner scanner, InventoryService inventory)  {
    	System.out.println("Enter the product id ");
    	int productId =scanner.nextInt();
		try {
			inventory.updateStock(productId);
		} catch (NegativeException e) {
			System.out.println(e.getMessage());
		}catch(InsufficientStockException e) {
			System.out.println(e.getMessage());
		}catch(InventoryException e) {
			System.out.println(e.getMessage());
		}
	
		
	}

	public static void displayMenu() {
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. View Inventory");
        System.out.println("4. Place Order");
        System.out.println("5. Upadate the Stocks");
        System.out.println("6. View Orders");
        System.out.println("7. Exit");
        System.out.print("Choose an option: ");
    }

    private static int getUserChoice(Scanner scanner) {
        return scanner.nextInt();
    }

    private static void addItem(Scanner scanner, InventoryService inventory) {
      
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
    }

    private static void removeItem(Scanner scanner, InventoryService inventory) {
       
        System.out.print("Enter Item ID to remove: ");
       
        int removeId = scanner.nextInt();
        inventory.removeProduct(removeId);
       
       
    }

    private static void placeOrder(Scanner scanner, OrderService orderService,InventoryService inventory) throws OrderException {
      
        System.out.print("Enter Customer ID to order: ");
        String customerId = scanner.next();

        boolean ordering = true;
        while (ordering) {
            System.out.print("1. Add Product to Order\n2. Place the Order\nChoose an option: ");
            int addChoice = scanner.nextInt();
            scanner.nextLine(); 

            switch (addChoice) {
                case 1:
                    addProductToOrder(scanner, orderService, inventory);
                    break;
                case 2:
                Order placedOrder =	orderService.placeOrder(customerId, orderService.getProducts());
                    if( placedOrder== null) {
                    	System.out.println("Nothing is added to order");
                        break;
                    }
                    System.out.println("order placed succefully");
                    orders.add(placedOrder);
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addProductToOrder(Scanner scanner, OrderService orderService,  InventoryService inventory ) {
      
      
        try {
        	  System.out.print("Enter Product ID to order: ");
        	  int orderId = scanner.nextInt();
        	  System.out.print("Enter the qauntity: ");
        	  int quantity = scanner.nextInt();
        	  
            Product orderItem = inventory.getProductById(orderId); 
            orderService.addProductToOrder(orderItem, quantity);
            System.out.println("Product added to order.");
        } catch (InventoryException e) {
            System.out.println( e.getMessage());
        }
    }
}