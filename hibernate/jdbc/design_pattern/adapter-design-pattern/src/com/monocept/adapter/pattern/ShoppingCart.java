package com.monocept.adapter.pattern;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart  {
	private List<Item> items;

	public ShoppingCart() {
		this.items = new LinkedList<>();
	}
	
	public void add(Item item) {
		items.add(item);
	}
	
	public void remove(Item item) {
		items.remove(item);
	}
	
	public double totalPrice() {
		double price = 0;
		for( Item item : items) {
			price =  price + item.itemPrice();
		}
		return price;
	}

}
