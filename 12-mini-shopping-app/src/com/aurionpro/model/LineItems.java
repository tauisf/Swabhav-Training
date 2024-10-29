package com.aurionpro.model;



public class LineItems {
	
	private int lineId;
	private int quantity;
	private Product product;

	public LineItems(int lineId, int quantity, Product product) {
		super();
		this.lineId = lineId;
		this.quantity = quantity;
		this.product = product;
	}


	public int getLineId() {
		return lineId;
	}


	public void setLineId(int lineId) {
		this.lineId = lineId;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	@Override
	public String toString() {
		return "LineItems [lineId=" + lineId + ", quantity=" + quantity + ", product=" + product + "]";
	}


	
	
	
	
	
}
