package com.monocept.decorator;

public class StandardHat implements Hat {

	@Override
	public String getName() {
		return "Standard hat";
	}

	@Override
	public double getPrice() {
		return 500;
	}

	@Override
	public String getDescription() {
		return " Standard hat's Description";
	}

}
