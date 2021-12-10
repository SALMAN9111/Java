package com.monocept.factory.method;

public class Tesla implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("TESLA is strating");
	}

	@Override
	public void stop() {
		System.out.println("TESLA is stoping.");
	}

}
