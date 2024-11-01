package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;



import com.aurionpro.exception.OrderException;

public class OrderService {
	    private List<Product> Orderproducts;
	   
	    
	    public OrderService() {
			super();
			Orderproducts = new ArrayList<>();
		}

		public void addProductToOrder(Product product,int quantity) {
			if (quantity <= 0 || quantity > product.getQuantity()) {
				System.out.println("Insufficient stock for product ");
				return;
			}
			
	    	Orderproducts.add(product);
	        product.setQuantity(product.getQuantity() - quantity);

	    }
	    
	    public List<Product> getProducts() {
	        return Orderproducts;
	    }

	    public Order placeOrder(String customerId, List<Product> products) throws OrderException {
	    	 if (products == null || products.isEmpty()) {
	    		return null;
	    	}
			return  new Order(customerId,products);
	        
	    }
	    
	    
	  

		
	    
}
