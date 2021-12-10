package com.monocept.factory.method;

public class BmwFactory implements IAutoMobileFactory {
	private static BmwFactory bmwFactoryInstance;
	

	public static IAutoMobileFactory getInstance() {
		if(bmwFactoryInstance == null)
			return bmwFactoryInstance = new BmwFactory();
		return bmwFactoryInstance;
	}
 
	public IAutoMobile make() {
		Bmw bmw = new Bmw();
		return bmw;
	}

}
