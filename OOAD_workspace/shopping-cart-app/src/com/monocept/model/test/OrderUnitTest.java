package com.monocept.model.test;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.monocept.model.Order;
import com.monocept.model.OrderItem;
import com.monocept.model.Product;

public class OrderUnitTest {
	Date d = new Date();

	@Test
	public void orderConstructorInitializing() {
		Product product = new Product(1, "Hf_Book", 250, 0);
		OrderItem orderItem = new OrderItem(1, product, 3);

		// Arrange and Act
		Order order = new Order(1, d);
		int exceptedOrderId = 1;
		List<OrderItem> exceptedOrderItem = order.getOrderItems();
		order.addOrderItem(orderItem);

		// Assert
		Assert.assertEquals(order.getOrderId(), exceptedOrderId);
		Assert.assertEquals(order.getOrderItems(), exceptedOrderItem);
		Assert.assertEquals(order.getDate(), d);

	}

	@Test
	public void orderAddingTwoOrderitemsWithCheckoutprice() {
		Product product1 = new Product(1, "Hf_book", 250, 0);
		Product product2 = new Product(2, "python", 350, 0);

		OrderItem orderItem1 = new OrderItem(1, product1, 3);
		OrderItem orderItem2 = new OrderItem(2, product2, 3);

		// Arrange and Act
		int exceptedOrderId = 1;
		Order order1 = new Order(1, d);
		order1.addOrderItem(orderItem1);
		order1.addOrderItem(orderItem2);

		int exceptedSize = 2;
		List<OrderItem> exceptedOrderItem = order1.getOrderItems();
		double exceptedCheckOutPrice = 1800;

		// Assert
		Assert.assertEquals(order1.getOrderId(), exceptedOrderId);
		Assert.assertEquals(order1.getOrderItems(), exceptedOrderItem);
		Assert.assertTrue(order1.checkOutPrice() == exceptedCheckOutPrice);
		Assert.assertTrue(order1.count() == exceptedSize);

	}

	@Test
	public void orderAaddingTwoSameOrderitemsWithCheckoutprice() {
		Product product1 = new Product(1, "Hf_book", 200, 0);
		Product product2 = new Product(2, "python_book", 300, 0);
		
		OrderItem orderItem1 = new OrderItem(1, product1, 3);
		OrderItem orderItem2 = new OrderItem(2, product2, 3);
		OrderItem orderItem3 = new OrderItem(3, product1, 3);

		// Arrange and Act
		int exceptedOrderId = 1;
		Order order1 = new Order(1, d);
		order1.addOrderItem(orderItem1);
		order1.addOrderItem(orderItem2);
		order1.addOrderItem(orderItem3);

		int exceptedSize = 2;
		double exceptedCheckOutPrice = 2100;

		// Assert
		for(OrderItem item : order1.getOrderItems()) {
			System.out.println(item.getQyt());
			System.out.println(item.getProduct().getProductName());
			
		}

		Assert.assertEquals(order1.getOrderId(), exceptedOrderId);
		Assert.assertTrue(order1.count() == exceptedSize);
		Assert.assertEquals(order1.getOrderItems().get(0).getQyt(), 6);
		Assert.assertTrue(order1.checkOutPrice() == exceptedCheckOutPrice);
		
		
		
		

	}

}
