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
		return Orderproducts;
	}

	public Order placeOrder(String customerId, List<Product> products) throws OrderException {
		if (products == null || products.isEmpty()) {
			return null;
		}

		return new Order(customerId, products);

	}

}
