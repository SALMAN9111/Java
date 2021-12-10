package com.monocept.model;

public class CustomerDB implements IDataAccessable {

	@Override
	public void create() {
		System.out.println("Creating customer table.");
	}

	@Override
	public void read() {
		System.out.println("Reading customer table.");
	}

	@Override
	public void update() {
		System.out.println("Updating cusyomer table.");
	}

	@Override
	public void delete() {
		System.out.println("Deleting row of customer table.");
	}

}
