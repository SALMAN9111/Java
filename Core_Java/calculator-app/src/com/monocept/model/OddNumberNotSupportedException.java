package com.monocept.model;

@SuppressWarnings("serial")
public class OddNumberNotSupportedException extends RuntimeException {
	public OddNumberNotSupportedException(Calculator c) {
		super("Odd numbers are not supported: "+c.getNumber());

	}

}