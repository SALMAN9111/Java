package com.monocept.model.test;
import java.util.ArrayList;
import java.util.Iterator;
import com.monocept.model.OrderItem;
public class CollectionTest {

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

	private static void printUsingForEachLopp(@SuppressWarnings("rawtypes") ArrayList basket) {
		double total = 0;
		for (Object item : basket) {
			OrderItem or = (OrderItem) item;
			System.out.println(or.getId());
			System.out.println(or.getName());
			System.out.println(or.getQyt());
			System.out.println(or.getPrice());
			total = total + or.getPrice();
		}
		System.out.println("Total price :" + total);

	}

	private static void printUsingIterator(@SuppressWarnings("rawtypes") ArrayList basket) {
		double total = 0;
		@SuppressWarnings("rawtypes")
		Iterator iter = basket.iterator();
		while (iter.hasNext()) {
			OrderItem item = (OrderItem) iter.next();
			System.out.println(item.getId());
			System.out.println(item.getName());
			System.out.println(item.getQyt());
			System.out.println(item.getPrice());
			total = total + item.getPrice();
		}
		System.out.println("Total price :" + total);
	}

}
