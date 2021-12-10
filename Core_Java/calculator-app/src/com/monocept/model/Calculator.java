package com.monocept.model;

public class Calculator {
	private double number;
	
	public int cubeEvenNumber(int number) throws OddNumberNotSupportedException {
		this.number = number ;
		if(number % 2 != 0) {
			throw new OddNumberNotSupportedException(this);
		}
		return (number*number*number);		
	}
	
	public double getNumber() {
		return number;
	}
}
