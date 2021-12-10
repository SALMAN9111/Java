package com.monocept.model;

public class DepartmentDB implements IDataAccessable {
	
	@Override
	public void create() {
		System.out.println("Creating deparment table.");
	}

	@Override
	public void read() {
		System.out.println("Reading deparment table.");
	}

	@Override
	public void update() {
		System.out.println("Updating deparment table.");
	}

	@Override
	public void delete() {
		System.out.println("Deleting row of deparment table.");
	}


}
