package com.monocept.isp.violation.test;

import com.monocept.isp.violation.IWorker;
import com.monocept.isp.violation.Manager;
import com.monocept.isp.violation.Robot;

public class IspViolationTest {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Robot robot = new Robot();
		
		AtTheWorkStation(manager);
		AtTheWorkStation(robot);
		
		AtTheCafeteria(manager);
		AtTheCafeteria(robot);
	}
	
	private static void AtTheWorkStation(IWorker worker) {
		System.out.println("At the work Station");
		worker.startWork();
		worker.stoptWork();
		System.out.println();
	}
	
	private static void AtTheCafeteria(IWorker worker) {
		System.out.println("At the work Station");
		worker.startEat();
		worker.stopEat();
		System.out.println();
	}
}
