package com.monocept.model;

import java.util.LinkedList;
import java.util.List;

public class Customer {
	private int customerId;
	private String customerName;
	private List<Order> orders;

	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.orders = new LinkedList<Order>();
	}

	public List<Order> getOrder() {
		return orders;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public int orderCount() {
		return orders.size();
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}
	
	public double totalPrice() {
		double price = 0;
		for(Order order : orders) {
				price = price + order.checkOutPrice();
			}
		return price;
	}

}
