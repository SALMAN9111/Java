package com.monocept.decorator.test;

import com.monocept.decorator.GoldenHat;
import com.monocept.decorator.Hat;
import com.monocept.decorator.PremiumHat;
import com.monocept.decorator.RibbonedHat;
import com.monocept.decorator.StandardHat;

public class DecoratorTest {
	public static void main(String[] args) {
		Hat hat = new RibbonedHat(new GoldenHat(new StandardHat()));
		System.out.println("Hat name : "+hat.getName());
		System.out.println("Price of hat : "+hat.getPrice());
		System.out.println("Description of hat : "+hat.getDescription());
		
		Hat hat1 = new RibbonedHat(new GoldenHat(new PremiumHat()));
		System.out.println("Hat name : "+hat1.getName());
		System.out.println("Price of hat : "+hat1.getPrice());
		System.out.println("Description of hat : "+hat1.getDescription());
	}

}
