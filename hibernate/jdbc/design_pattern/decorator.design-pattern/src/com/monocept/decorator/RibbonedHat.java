package com.monocept.decorator;

public class RibbonedHat extends HatDecorator {
	
	private Hat hat;

	public RibbonedHat(Hat hat) {
		this.hat = hat;
	}

	@Override
	public double getPrice() {
		return 100 + hat.getPrice();
	}

	@Override
	public String getDescription() {
		return "Ribboned Hat with " + hat.getDescription();
	}

}
