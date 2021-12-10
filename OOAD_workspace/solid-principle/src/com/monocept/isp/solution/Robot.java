package com.monocept.isp.solution;

public class Robot implements IWorkable {

	@Override
	public void startWork() {
		System.out.println("Robot starts working");
		
	}

	@Override
	public void stoptWork() {
		System.out.println("Robot stop Working");
		
	}

}
