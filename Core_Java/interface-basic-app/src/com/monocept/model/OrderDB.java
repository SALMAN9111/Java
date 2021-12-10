package com.monocept.model;

public class OrderDB implements IDataAccessable {

	@Override
	public void create() {
		System.out.println("Creating order table.");
	}

	@Override
	public void read() {
		System.out.println("Reading order table.");
	}

	@Override
	public void update() {
		System.out.println("Updating order table.");
	}

	@Override
	public void delete() {
		System.out.println("Deleting row of order table.");
	}

}
