package com.monocept.factory.pattern;

public class Bmw implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("BMW is Starting.");

	}

	@Override
	public void stop() {
		System.out.println("BMW is Stoping.");

	}

}
