package com.monocept.model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Order {
	private final int orderId;
	private final Date date;
	private List<OrderItem> items;

	public Order(int orderId, Date date) {
		this.orderId = orderId;
		this.date = date;
		this.items = new LinkedList<>();
	}

	public void addOrderItem(OrderItem item) {

		for(int i=0; i<items.size(); i++) {
			if(items.get(i).getProduct().getId() == item.getProduct().getId()) {
				int set = item.getQyt() + items.get(i).getQyt();
				items.get(i).setQyt(set);
				return;
			}
		}

		items.add(item);
	}

	public int getOrderId() {
		return orderId;
	}

	public Date getDate() {
		return date;
	}

	public List<OrderItem> getOrderItems() {
		return items;
	}

	public int count() {
		return items.size();
	}

	public double checkOutPrice() {
		double price = 0;
		for (OrderItem orderPrice : items) {
			price = price + orderPrice.calculateItemPrice();
		}
		return price;

	}

}
