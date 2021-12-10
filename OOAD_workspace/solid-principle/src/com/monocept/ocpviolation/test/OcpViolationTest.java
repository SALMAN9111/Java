package com.monocept.ocpviolation.test;

import com.monocept.ocp.violation.FestivalType;
import com.monocept.ocp.violation.FixedDeposit;

public class OcpViolationTest {

	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit(101, "Frank", 100000, 10, FestivalType.NEW_YEAR);
		System.out.println(fd1.calcSimpleInterest());
	}

}
