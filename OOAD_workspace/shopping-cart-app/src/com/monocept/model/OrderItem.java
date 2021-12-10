package com.monocept.model;

public class OrderItem {
	private final int itemId;
	private final Product product;
	private int qyt;
	
	public OrderItem(int itemId, Product product, int number) {
		this.itemId = itemId;
		this.product = product;
		setQyt(number);
	}

	public Product getProduct() {
		return product;
	}
	
	public void setQyt(int number) {
		qyt = number;
	}

	public int getQyt() {
		return this.qyt ;
	}

	public int getItemId() {
		return itemId;
	}
	
	public double calculateItemPrice() {
		return product.actualPriceAfterDiscount() * this.qyt;
	}

}
