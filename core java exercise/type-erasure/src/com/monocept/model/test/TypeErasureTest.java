package com.monocept.model.test;

import com.monocept.model.Box;

public class TypeErasureTest {
	public static void main(String[] args) {
		Box<Integer> integer = new Box<Integer>();
		Box<Double> d = new Box<Double>();
		
		//integer.add(new  Integer(10));
		//d.add(new Double(5.2));
		
		integer.add(10);
		d.add(5.2);

		System.out.println("Integer Value: "+integer.getValue());
		System.out.println("Double value: "+d.getValue());
		
	}

}
