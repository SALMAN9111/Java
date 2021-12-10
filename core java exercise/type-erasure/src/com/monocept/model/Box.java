package com.monocept.model;

public class Box<T extends Number> {
	private T obj;
	
	public void add(T obj) {
		this.obj = obj;
	}
	
	public T getValue() {
		return obj;
	}

}
/*public class Box {
private Number obj;

public void add(Number obj) {
	this.obj = obj;
}

public Number getValue() {
	return obj;
}

}*/