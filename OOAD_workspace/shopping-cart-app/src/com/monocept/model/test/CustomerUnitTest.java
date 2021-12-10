package com.monocept.model.test;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.monocept.model.Customer;
import com.monocept.model.Order;
import com.monocept.model.OrderItem;
import com.monocept.model.Product;

public class CustomerUnitTest {
	Date d = new Date(); 

	@Test
	public void customerConstructorIntializing() {

		// Arrange and Act
		Customer customer = new Customer(1, "Frank");
		int exceptedCustomerId = 1;
		String exceptedCustomerName = "Frank";

		// Assert
		Assert.assertEquals(customer.getCustomerId(), exceptedCustomerId);
		Assert.assertEquals(customer.getCustomerName(), exceptedCustomerName);
	}

	
	@Test
	public void customerCheckingSize() {
		
		Product product = new Product(1, "something", 100, 0);
		OrderItem orderItem = new OrderItem(1, product, 3);
		Order order1 = new Order(1, d);

		Product product1 = new Product(2, "some", 200, 0);
		OrderItem orderItem1 = new OrderItem(1, product1, 3);
		Order order2 = new Order(2, d);

		// Arrange and Act
		Customer customer = new Customer(1,"Virat");
		int exceptedCustomerId = 1;
		String exceptedCustomerName = "Virat";
		order1.addOrderItem(orderItem);
		order2.addOrderItem(orderItem1);
		customer.addOrder(order1);
		customer.addOrder(order2);
		List<Order> exceptedOrderItem = customer.getOrder();
		int exceptedCount = 2;


		// Assert
		Assert.assertEquals(customer.getCustomerId(), exceptedCustomerId);
		Assert.assertEquals(customer.getCustomerName(), exceptedCustomerName);
		Assert.assertEquals(customer.getOrder(), exceptedOrderItem);
		Assert.assertEquals(customer.orderCount(), exceptedCount);
		Assert.assertTrue(customer.getOrder().get(1).checkOutPrice() == 600);
	}
}
