package com.monocept.model.test;

import org.junit.Assert;
import org.junit.Test;

import com.monocept.model.OrderItem;
import com.monocept.model.Product;


public class OrderItemUnitTest {
	
	

	@Test
	public void orderItemConstructorInitializing() {
		Product product  = new Product(1, "somethimg", 250, 0);
		
		// Arrange and Act
		OrderItem orderItem = new OrderItem(1,product, 1);
		int exceptedId = 1;
		Product exceptedProductItem =  orderItem.getProduct();
		double exceptedPrice = 250;

		// Assert
		Assert.assertTrue(orderItem.getProduct().getId() == product.getId());
		Assert.assertEquals(orderItem.getItemId(), exceptedId);
		Assert.assertEquals(orderItem.getProduct(), exceptedProductItem);
		Assert.assertTrue(orderItem.calculateItemPrice() == exceptedPrice);
	}
	
	@Test
	public void orderItemConstructorInitializingWithQuantityOfProduct() {
		Product product  = new Product(1, "somethimg", 250, 20);
		// Arrange and Act
		OrderItem orderItem = new OrderItem(1,product, 1);
		int exceptedId = 1;
		Product exceptedProductItem =  orderItem.getProduct();
		double exceptedPrice = 200;

		// Act
		Assert.assertEquals(orderItem.getItemId(), exceptedId);
		Assert.assertEquals(orderItem.getProduct(), exceptedProductItem);
		Assert.assertTrue(orderItem.calculateItemPrice() == exceptedPrice);
	}

}
