package com.monocept.simple.singleton.factory;

public class AutoMobileFactory {
	private static AutoMobileFactory instance;
	
	public AutoMobileFactory() {
		System.out.println("auto");
	}

	public static AutoMobileFactory getInstance() {
		if (instance == null)
			instance = new AutoMobileFactory();
		return instance;
	}

	public IAutoMobile make(AutoType type) {
		if (type == AutoType.BMW) {
			Bmw bmw = new Bmw();
			return bmw;
		}

		if (type == AutoType.AUDI) {
			Audi audi = new Audi();
			return audi;
		}

		if (type == AutoType.TESLA) {
			Tesla tesla = new Tesla();
			return tesla;
		}
		return null;

	}

}
