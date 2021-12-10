package com.monocept.isp.violation;

public class Manager implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Manager started working.");
	}

	@Override
	public void stoptWork() {
		System.out.println("manager stop working");

	}

	@Override
	public void startEat() {
		System.out.println("Manager eating food");

	}

	@Override
	public void stopEat() {
		System.out.println("Manager stop eating");

	}

}
