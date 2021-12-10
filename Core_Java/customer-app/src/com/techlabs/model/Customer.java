package com.techlabs.model;

import java.util.UUID;

public class Customer {

	private int amount;
	private String name;
	private UUID id;
	//private static int ids = 1000;

	public Customer(String name, int amount) {
		UUID uuid = UUID.randomUUID();
		this.setName(name);
		this.setAmount(amount);
		id = uuid;
	}

	public UUID getId() {
		return id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
