package com.monocept.ocp.solution.test;

import com.monocept.ocp.solution.DiwaliRateCalculator;
import com.monocept.ocp.solution.FixedDeposit;
import com.monocept.ocp.solution.NormalRateCalculator;

public class OcpSolutionTest {
	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(1, "Frank", 100000, 10, new DiwaliRateCalculator());
		System.out.println(fd.calcSimpleInterest());
		
		FixedDeposit fd1 = new FixedDeposit(2, "John", 500000, 10, new NormalRateCalculator());
		System.out.println(fd1.calcSimpleInterest());
	}
	
	

}
