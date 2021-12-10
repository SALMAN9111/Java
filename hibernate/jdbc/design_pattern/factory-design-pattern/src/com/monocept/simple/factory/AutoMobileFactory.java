package com.monocept.simple.factory;

public class AutoMobileFactory {
	
	public IAutoMobile make(AutoType type) {
		if(type == AutoType.BMW) {
			Bmw bmw = new Bmw();
			return bmw;
		}
		
		if(type == AutoType.AUDI) {
			Audi audi = new Audi();
			return audi;
		}
		
		if(type == AutoType.TESLA) {
			Tesla tesla = new Tesla();
			return tesla;
		}
		return null;
		
	}

}
