package com.monocept.model;

public class MyThread implements Runnable{

	@SuppressWarnings("unused")
	@Override
	public void run() {
		TimePrinter time = new TimePrinter();
	}
	

}
