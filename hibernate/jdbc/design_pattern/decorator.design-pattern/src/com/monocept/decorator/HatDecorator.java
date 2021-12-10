package com.monocept.decorator;

public abstract  class HatDecorator implements Hat {
	
	
	@Override
	public String getName() {
		return "SomeHat";
	}

}
