package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItems;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

public class ShoppingApp {
	private static Scanner scanner = new Scanner(System.in);
	private static List<Customer> customers = new ArrayList<>();

	public static void main(String[] args) {
		boolean exit = false;

		while (!exit) {

			System.out.println("1.Add Customer 2.Existing User 3.Exit the App ");
			int userChoice = scanner.nextInt();

			if (userChoice == 2) {
				ExistedCustomer();

			} else if (userChoice == 1) {
				addCustomer();
			} else if(userChoice == 3) {
				exit = true;
			}else {
				System.out.println("Enter the valid choice!");
			}
		}
		System.out.println("Thank for shopping with us!");
	}

	private static void addCustomer() {
		System.out.println("Enter the Customer Id: ");
		int cusId = scanner.nextInt();

		for (Customer customer : customers) {
			if (customer.getCustomerId() == cusId) {
				System.out.println("Customer already exist!");
				return;
			}
		}

		System.out.println("Enter the name:");
		String name = scanner.next();

		System.out.println("Enter the Mobile no: ");
		long mobile = scanner.nextLong();

		customers.add(new Customer(cusId, name, mobile));
		System.out.println(customers);

	}

	private static void ExistedCustomer() {
		if (customers.isEmpty()) {
			System.out.println("No Customer found");
			return;
		}
		boolean existed = true;
		while (existed) {
			for (Customer customer : customers) {
				System.out.println(customer.getCustomerId() + " " + customer.getName());
			}

			Customer selectedCustomer = selectCustomer();

			if (selectedCustomer == null) {
				System.out.println("Customer does not exist!");

			} else {
				existed = false;
				shoppingChoice(selectedCustomer);

			}
		}

	}

	private static Customer selectCustomer() {

		System.out.println("Enter Customer id to manage :");
		int existedUserChoice = scanner.nextInt();

		for (Customer customer : customers) {
			if (customer.getCustomerId() == existedUserChoice)
				return customer;
		}

		return null;
	}

	private static void shoppingChoice(Customer customer) {
		
		boolean exit = false;
		while (!exit) {
            System.out.println("1. Add Product 2. View Total 3. Back");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addProduct(customer);
                    break;
                case 2:
                    viewOrderTotal(customer);
                    break;
                case 3:
                    exit = true; // Go back to the main menu
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
	}
	}

	private static void viewOrderTotal(Customer customer) {
		 if (customer.getOrders().isEmpty()) {
		        System.out.println("No orders for this customer.");
		        return;
		    }
		 
		 System.out.println("Select an order to view total:");
		    for (Order order : customer.getOrders()) {
		        System.out.println("Order ID: " + order.getOrderId() + " Date: " + order.getDate());
		    }
		    

		    System.out.println("Enter Order ID to view total:");
		    int selectedOrderId = scanner.nextInt();

		    Order selectedOrder = null;
		    for (Order order : customer.getOrders()) {
		        if (order.getOrderId() == selectedOrderId) {
		            selectedOrder = order;
		            break;
		        }
		    }

		    if (selectedOrder == null) {
		        System.out.println("Invalid Order ID.");
		        return;
		    }

		    
		    double total = selectedOrder.calculateTotal();
		    System.out.println("Total for Order ID " + selectedOrder.getOrderId() + ": " + total);
		}
	
	
		
	

	private static void addProduct(Customer customer) {
		System.out.println("Creating a new order for Customer: " + customer.getName());

		System.out.println("Enter Order ID: ");
		int orderId = scanner.nextInt();
		
		for (Order order : customer.getOrders()) {
	        if (order.getOrderId() == orderId) {
	            System.out.println(" Order id already exists ");
	            return;
	        }
	    }

		System.out.println("Enter Order Date (e.g., 10-10-2024): ");
		String orderDate = scanner.next();

		Order newOrder = new Order(orderId, orderDate);
		boolean addingProducts = true;
		while (addingProducts) {

			System.out.println("1.Add product 2. exit");
			int chocie2 = scanner.nextInt();

			switch (chocie2) {
			case 1:
				System.out.println("Enter Product ID: ");
				int productId = scanner.nextInt();

				System.out.println("Enter Product Name: ");
				String name = scanner.next();

				System.out.println("Enter Product Unit Price: ");
				double unitPrice = scanner.nextDouble();

				Product product = new Product(productId, name, unitPrice);

				System.out.println("Enter Line ID: ");
				int lineId = scanner.nextInt();

				System.out.println("Enter Quantity: ");
				int quantity = scanner.nextInt();

				LineItems listitems = new LineItems(lineId, quantity, product);
				newOrder.addLineItem(listitems);
				break;
			case 2:
				addingProducts = false;
				break;

			default:
				System.out.println("Enter valid Choice! ");
				break;
				
			}
			
			
		}
		customer.addOrder(newOrder);
		System.out.println(customer);

	}

}
