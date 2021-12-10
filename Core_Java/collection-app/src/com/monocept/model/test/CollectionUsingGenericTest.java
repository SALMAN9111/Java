package com.monocept.model.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.monocept.model.OrderItem;

public class CollectionUsingGenericTest {
	static double total = 0;

	public static void main(String[] args) {
		OrderItem item1 = new OrderItem(1001, "tata tea", 2, 150);
		OrderItem item2 = new OrderItem(1002, "book", 10, 70);

		ArrayList<OrderItem> basket = new ArrayList<OrderItem>();
		basket.add(item1);
		basket.add(item2);

		printUsingIterator(basket);
		System.out.println();
		printUsingForEachLopp(basket);

	}

	private static void printUsingForEachLopp(ArrayList<OrderItem> basket) {
		double total = 0;
		for (Object item : basket) {
			OrderItem or = (OrderItem) item;
			System.out.println("Item Id: " + or.getId());
			System.out.println("Item Name: " + or.getName());
			System.out.println("Item Quantity: " + or.getQyt());
			System.out.println("Item Price: " + or.getPrice());
			total = total + or.getPrice();
		}
		System.out.println("Total price :" + total);
	}

	private static void printUsingIterator(ArrayList<OrderItem> basket) {

		Iterator<OrderItem> iter = basket.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
