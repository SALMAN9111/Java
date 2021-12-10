package com.techlabs.model.test;

import com.techlabs.model.Customer;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c1 = new Customer("xyz", 10000);
		System.out.println("UUID : " + c1.getId());

		Customer c2 = new Customer("xy", 20000);
		System.out.println("UUID : "+c2.getId());

		Customer c3 = new Customer("x", 30000);
		System.out.println("UUID : "+c3.getId());

		System.out.println("UUID : " + c1.getId());
	}
}
