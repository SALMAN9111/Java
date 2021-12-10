package com.monocept.simple.singleton.factory;


class Tesla implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("TESLA is starting.");
	}

	@Override
	public void stop() {
		System.out.println("TESLA is stoping.");
	}

}
