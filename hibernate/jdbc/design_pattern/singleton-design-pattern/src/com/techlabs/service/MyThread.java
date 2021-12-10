package com.techlabs.service;

public class MyThread implements Runnable {

	@Override
	public void run() {
		DataService ds = DataService.getInstance();
		System.out.println(Thread.currentThread().getName()+" "+ds.hashCode());
		
	}

}
