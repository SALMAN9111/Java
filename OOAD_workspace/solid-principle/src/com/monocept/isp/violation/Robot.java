package com.monocept.isp.violation;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot started working");

	}

	@Override
	public void stoptWork() {
		System.out.println("Robot Stop working");

	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robot cannot eat");

	}

	@Override
	public void stopEat() {
		throw new RuntimeException("Robot cannot eat");


	}

}
