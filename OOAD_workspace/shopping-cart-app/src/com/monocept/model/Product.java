package com.monocept.model;

public class Product {
	private final int id;
	private final String productName;
	private double price;
	private double discount;
	
	
	public Product(int id, String productName, double price, double discount) {
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.discount = discount;
	}


	public int getId() {
		return id;
	}


	public String getProductName() {
		return productName;
	}


	public double getPrice() {
		return price;
	}


	public double getDiscount() {
		return discount;
	}
	
	public double actualPriceAfterDiscount() {
		return price = price - ((this.discount/100) * price);
		
	}

}
