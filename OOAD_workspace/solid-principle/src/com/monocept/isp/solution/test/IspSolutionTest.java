package com.monocept.isp.solution.test;

import com.monocept.isp.solution.IEatWork;
import com.monocept.isp.solution.IWorkable;
import com.monocept.isp.solution.Manager;
import com.monocept.isp.solution.Robot;

public class IspSolutionTest {
	
	public static void main(String[] args) {
		Manager manager = new Manager();
		Robot robot = new Robot();
		
		AtTheWorkStation(manager);
		AtTheWorkStation(robot);
		
		

		
	}
	
	private static void AtTheWorkStation(IEatWork worker) {
		System.out.println("At the work Station");
		worker.startWork();
		worker.stoptWork();
		worker.stopEat();
		worker.stopEat();
		System.out.println();
	}
	
	private static void AtTheWorkStation(IWorkable worker) {
		System.out.println("At the work Station");
		worker.startWork();
		worker.stoptWork();
		System.out.println();
	}



}
