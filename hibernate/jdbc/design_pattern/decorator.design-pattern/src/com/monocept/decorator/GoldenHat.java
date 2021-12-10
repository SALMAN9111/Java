package com.monocept.decorator;

public class GoldenHat extends HatDecorator {
	private Hat hat;

	public GoldenHat(Hat hat) {
		this.hat = hat;
	}
	
	@Override
	public double getPrice() {
		return 200 + hat.getPrice();
	}

	@Override
	public String getDescription() {
		return " Golden color " + hat.getDescription();
	}

}
