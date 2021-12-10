package com.monocept.simple.factory;

class Bmw implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("BMW is starting.");
	}

	@Override
	public void stop() {
		System.out.println("BMW is stoping.");
	}

}
