package com.monocept.decorator1.test;

import com.monocept.decorator1.CarInspection;
import com.monocept.decorator1.CarService;
import com.monocept.decorator1.OilChange;
import com.monocept.decorator1.TyreRotation;

public class DecoratorTest {
	public static void main(String[] args) {
		CarService service = new OilChange(new TyreRotation(new CarInspection()));
		System.out.println("Service cost : "+service.getCost());
		System.out.println("Details of service : "+service.getDetails());
	}

}
