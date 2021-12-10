package com.monocept.model.test;

import java.util.Date;

import com.monocept.model.Customer;
import com.monocept.model.Order;
import com.monocept.model.OrderItem;
import com.monocept.model.Product;

public class InvoiceInfoTest {

	public static void main(String[] args) {

		Date d = new Date();
		
		Product product1 = new Product(1, "something", 200, 5);
		Product peoduct2 = new Product(2, "some", 300, 3);
		Product procut3 = new Product(3, "else", 100, 7);

		OrderItem orderItem1 = new OrderItem(101, product1, 5);
		OrderItem orderItem2 = new OrderItem(102, peoduct2, 10);
		OrderItem orderItem3 = new OrderItem(103, procut3, 3);

		Order order1 = new Order(1, d);
		Order order2 = new Order(2, d);
		order1.addOrderItem(orderItem1);
		order1.addOrderItem(orderItem2);

		order2.addOrderItem(orderItem3);

		Customer customer1 = new Customer(1, "Frank");
		customer1.addOrder(order1);
		customer1.addOrder(order2);

		printCustomerInfo(customer1);

	}

	private static void printCustomerInfo(Customer customer) {
		System.out.println("Invoice Purchaged History");
		System.out.println("Customer Name: " + customer.getCustomerName() + "\t customer Id: " + customer.getCustomerId());
		System.out.println("\nDetails of " + customer.orderCount() + " Orders");
		int numberOfOrders = 1;
		for (Order order : customer.getOrder()) {
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("#" + (numberOfOrders++) + " Order");
			System.out.println("Order ID:" + order.getOrderId() + "    Order date: " + order.getDate());
			int numberOfItems = 0;
			for (OrderItem orderItem : order.getOrderItems()) {

				System.out.println("\n#" + (++numberOfItems) + " OrderItem");
				System.out.println("Product name: " + orderItem.getProduct().getProductName());
				System.out.println("price: " + orderItem.getProduct().getPrice());
				System.out.println("discount: " + orderItem.getProduct().getDiscount() + "%");
				System.out.println("quantity :" + orderItem.getQyt());

			}
			System.out.println("\ntotal price for Order: "+order.checkOutPrice());
			System.out.println("---------------------------------------------------------------------------\n");
		}

	}

}
