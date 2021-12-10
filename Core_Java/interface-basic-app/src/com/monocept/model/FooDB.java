package com.monocept.model;

public abstract class FooDB implements IDataAccessable {
	
	@Override
	public void create() {
		System.out.println("Creating foo table.");
	}

}
