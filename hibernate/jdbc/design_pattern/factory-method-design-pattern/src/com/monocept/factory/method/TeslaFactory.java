package com.monocept.factory.method;

public class TeslaFactory implements IAutoMobileFactory {
	private static TeslaFactory teslaFactoryInstance;
	
	public static IAutoMobileFactory getInstance() {
		if(teslaFactoryInstance == null)
			return teslaFactoryInstance = new TeslaFactory();
		return teslaFactoryInstance;
	}

	public IAutoMobile make() {
		Tesla tesla = new Tesla();
		return tesla;
	}

}
