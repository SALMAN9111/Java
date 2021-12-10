package com.monocept.model.test;

import org.junit.Assert;
import org.junit.Test;

import com.monocept.model.Product;

public class ProductUnitTest {

	@Test
	public void productConstructorInitializing() {
		// Arrange and Act
		Product product = new Product(1, "Something", 250, 0);
		int exceptedId = 1;
		String exceptedProductName = "Something";
		double exceptedPrice = 250;

		// Act
		Assert.assertEquals(product.getId(), exceptedId);
		Assert.assertEquals(product.getProductName(), exceptedProductName);
		Assert.assertTrue(product.getPrice() == exceptedPrice);
	}

	@Test
	public void productConstructorWithDiscountValue() {
		// Arrange and Act
		Product product = new Product(1, "Something", 250, 20);
		int exceptedId = 1;
		String exceptedProductName = "Something";
		double exceptedPrice = 250;
		double exceptedDiscount = 200.0;

		// Act
		Assert.assertEquals(product.getId(), exceptedId);
		Assert.assertEquals(product.getProductName(), exceptedProductName);
		Assert.assertTrue(product.getPrice() == exceptedPrice);
		Assert.assertTrue(product.actualPriceAfterDiscount() == exceptedDiscount);
	}

}
