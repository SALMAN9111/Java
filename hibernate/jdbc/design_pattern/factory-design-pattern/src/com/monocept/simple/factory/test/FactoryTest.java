package com.monocept.simple.factory.test;

import com.monocept.simple.factory.AutoMobileFactory;
import com.monocept.simple.factory.AutoType;
import com.monocept.simple.factory.IAutoMobile;

public class FactoryTest {
	public static void main(String[] args) {
		AutoMobileFactory factory = new AutoMobileFactory();
		IAutoMobile auto = factory.make(AutoType.BMW);
		System.out.println(auto.getClass());
		auto.start();
		auto.stop();
	}

}
