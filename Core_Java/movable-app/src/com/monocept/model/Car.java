package com.monocept.model;

public class Car implements IMovable {

	@Override
	public void move() {
		System.out.println("Car is moving.");
	}

}
