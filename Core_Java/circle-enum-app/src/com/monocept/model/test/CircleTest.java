package com.monocept.model.test;

import com.monocept.model.BorderStyleType;
import com.monocept.model.Circle;

public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(5.5f, BorderStyleType.DOUBLE);
		Circle c2 = new Circle(3.3f, BorderStyleType.DOTTED);

		printDetails(c1);
		printDetails(c2);

		Circle[] circles = new Circle[2];
		circles[0] = c1;
		circles[1] = c2;

		printInfo(circles);
	}

	public static void printDetails(Circle c) {
		System.out.println("Radius of Circle is " + c.getRadius());
		System.out.println("Border of circle is " + c.getBorder());
		System.out.println("Area of circle is " + c.calcArea() + "\n");

	}

	public static void printInfo(Circle[] circleArray) {
		for (int i = 0; i < circleArray.length; i++) {
			printDetails(circleArray[i]);
		}

	}
}
