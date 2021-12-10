package com.monocept.decorator1;

public class TyreRotation extends CarSeviceDecorator{
private CarService service;
	
	public TyreRotation(CarService service) {
		this.service = service;
	}

	@Override
	public double getCost() {
		return 350 + service.getCost();
	}

	@Override
	public String getDetails() {
		return " Tyres are good" + service.getDetails();
	}
}
