package com.monocept.model;

public class FooChildDB extends FooDB{

	@Override
	public void read() {
		System.out.println("Reading foochild table.");
	}

	@Override
	public void update() {
		System.out.println("Updating foochild table.");
	}

	@Override
	public void delete() {
		System.out.println("Deleting row of foochild table");
	}

}
