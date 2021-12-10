package com.monocept.decorator1;

public class OilChange extends CarSeviceDecorator {
	private CarService service;
	
	public OilChange(CarService service) {
		this.service = service;
	}

	@Override
	public double getCost() {
		return 1200 + service.getCost();
	}

	@Override
	public String getDetails() {
		return " Oil changeed"+ service.getDetails();
	}

}
