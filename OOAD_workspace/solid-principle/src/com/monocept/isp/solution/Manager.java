package com.monocept.isp.solution;

public class Manager implements IEatWork{

	@Override
	public void startEat() {
		System.out.println("manager Starts eating");
		
	}

	@Override
	public void stopEat() {
		System.out.println("Manager stop eating");
	}

	@Override
	public void startWork() {
		System.out.println("Manager starts working");
		
	}

	@Override
	public void stoptWork() {
		System.out.println("Manager stop working");
		
	}

}
