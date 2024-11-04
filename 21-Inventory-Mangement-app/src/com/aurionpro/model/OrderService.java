package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.exception.InsufficientStockException;
import com.aurionpro.exception.NegativeException;
import com.aurionpro.exception.OrderException;

public class OrderService {
	private List<Product> Orderproducts;
	

	public OrderService() {
		super();
		Orderproducts = new ArrayList<>();
	}

	public void addProductToOrder(Product product, int quantity) {

		if (quantity < 0) {
			throw new NegativeException();
		}
		if (quantity <= 0 || quantity > product.getQuantity()) {
			throw new InsufficientStockException();

		}

		Orderproducts.add(product);
		product.setQuantity(product.getQuantity() - quantity);
		System.out.println("----Product added to order.");
	}

	public List<Product> getProducts() {
		 return new ArrayList<>(Orderproducts);
	}
	
	public void clearOrderList() {
		Orderproducts.clear();
	}
	

	public Order placeOrder(int supplierId) throws OrderException {
		 if (Orderproducts.isEmpty()) {
	            return null; // No products to place an order
	        }

	        // Create a copy of the current products
	        List<Product> productsForOrder = new ArrayList<>(Orderproducts);
	        clearOrderList(); // Clear the list for the next order

	        return new Order(supplierId, productsForOrder);

	}

}
