package com.monocept.simple.singleton.factory;

class Audi implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("AUDI is starting.");
	}

	@Override
	public void stop() {
		System.out.println("AUDI is stoping.");
	}
}
