package com.monocept.model;


public class Calculator {

	public int addPositiveNumber(int a, int b) {
		if (a < 0 || b < 0)
			throw new RuntimeException("number cannot be Zero");
		return a + b;
	}

}
