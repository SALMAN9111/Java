package com.monocept.model;

public class OrderItem {
	private final int id;
	private final String name;
	private final int qyt;
	private final double price;
	static double total = 0;

	public OrderItem(int id, String name, int qyt, double price) {
		this.id = id;
		this.name = name;
		this.qyt = qyt;
		this.price = price;
	}
	
	public double getTotal() {
		return getPrice();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQyt() {
		return qyt;
	}

	public double getPrice() {
		return price * qyt;
	}

	@Override
	public String toString() {

		return "Item Id:" + id + "\nItem Name: " + name + "\nItem Quantity: " + qyt + "\nItem Price: " + getPrice();
	}

}
