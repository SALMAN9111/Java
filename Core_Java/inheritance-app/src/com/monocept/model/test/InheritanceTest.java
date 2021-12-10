package com.monocept.model.test;

import com.monocept.model.Boy;
import com.monocept.model.Infant;
import com.monocept.model.Kid;
import com.monocept.model.Man;

public class InheritanceTest {
	public static void main(String[] args) {
		// caseStudy1();
		// caseStudy2();
		// caseStudy3();
		 System.out.println("caseStudy 4");
		 caseStudy4();
		 System.out.println("caseStudy 5");
		 caseStudy5();
	}

	public static void caseStudy1() {
		Man x = new Man();
		x.play();
		x.read();

	}

	public static void caseStudy2() {
		Boy y = new Boy();
		y.play();
		y.eat();
	}

	public static void caseStudy3() {
		Man x = new Boy();
		x.play();
		x.read();
	}

	public static void caseStudy4() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Infant());
		atThePark(new Kid());
	}

	private static void atThePark(Man m) {
		System.out.println("At the park");
		m.play();
		System.out.println(m.getClass().getName()+"\n");

	}

	public static void caseStudy5() {
		Object x = new Object();
		x = 10;
		System.out.println(x.toString());
		System.out.println(x.getClass()+"\n");

		x = "hello";
		System.out.println(x.toString());
		System.out.println(x.getClass()+"\n");

		x = new Man();
		System.out.println(x.toString());
		System.out.println(x.getClass()+"\n");
		
		x = "#";
		System.out.println(x.toString());
		System.out.println(x.getClass()+"\n");

		 Infant x1 = new Infant();
		 x = x1;
		 x1.play();
		 x1.read();
		 System.out.println(x1.getClass());
		
		

	}

}
