package com.monocept.decorator;

public class PremiumHat implements Hat {

	@Override
	public String getName() {
		return "Premium hat";
	}

	@Override
	public double getPrice() {
		return 500 ;
	}

	@Override
	public String getDescription() {
		return "Premium hat's Description";
	}

}
