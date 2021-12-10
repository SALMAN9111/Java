package com.monocept.simple.singleton.factory.test;

import com.monocept.simple.singleton.factory.AutoMobileFactory;
import com.monocept.simple.singleton.factory.AutoType;
import com.monocept.simple.singleton.factory.IAutoMobile;

public class FactoryTest {
	public static void main(String[] args) {
		AutoMobileFactory factory1 = AutoMobileFactory.getInstance();
		IAutoMobile auto1 = factory1.make(AutoType.BMW);
		System.out.println(auto1.getClass());
		auto1.start();
		auto1.stop();

		System.out.println();
		
		AutoMobileFactory factory2 = AutoMobileFactory.getInstance();
		IAutoMobile auto2 = factory2.make(AutoType.TESLA);
		System.out.println(auto1.getClass());
		auto2.start();
		auto2.stop();
		System.out.println(factory1.hashCode() == factory2.hashCode());

	}

}
