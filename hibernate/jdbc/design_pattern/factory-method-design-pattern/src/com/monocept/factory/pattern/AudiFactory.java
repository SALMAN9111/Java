package com.monocept.factory.pattern;

public class AudiFactory implements IAutoMobileFactory {
	private static AudiFactory audiFactoryInstance; 

	public static IAutoMobileFactory getInstance() {
		if(audiFactoryInstance == null)
			return audiFactoryInstance = new AudiFactory();
		return audiFactoryInstance;
	}
	
	public IAutoMobile make() {
		Audi audi = new Audi();
		return audi;
	}

}
