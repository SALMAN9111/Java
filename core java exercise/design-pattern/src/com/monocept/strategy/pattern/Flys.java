package com.monocept.strategy.pattern;

public interface Flys {

	String fly();

}


class CantFly implements Flys {
	public String fly() {
		return "I can't fly";
	}
}