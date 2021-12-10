package com.monocept.factory.method.test;

import com.monocept.factory.method.IAutoMobile;
import com.monocept.factory.method.IAutoMobileFactory;
import com.monocept.factory.method.TeslaFactory;

public class FactoryTest {

	public static void main(String[] args) {
		IAutoMobileFactory factory1 = TeslaFactory.getInstance();
		IAutoMobile auto = factory1.make();
		System.out.println(auto.getClass());
		auto.start();
		auto.stop();
		
		System.out.println();
		
		IAutoMobileFactory factory2 = TeslaFactory.getInstance();
		IAutoMobile auto1 = factory2.make();
		System.out.println(auto1.getClass());
		auto1.start();
		auto1.stop();

		System.out.println(factory1 == factory2);
		
	
	}

}

/*	IAutoMobileFactory factory1 = new BmwFactory();
		IAutoMobile auto =  factory1.make();
		System.out.println(auto.getClass());
		auto.start();
		auto.stop();
		
		System.out.println();
		
		IAutoMobileFactory factory2 = new TeslaFactory();
		IAutoMobile auto1 =  factory2.make();
		System.out.println(auto1.getClass());
		auto1.start();
		auto1.stop();*/