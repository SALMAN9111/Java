package com.monocept.model.test;

import com.monocept.model.BorderStyleType;
import com.monocept.model.Circle;
import com.monocept.model.ColorType;

public class CircleColorTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(5.5f, BorderStyleType.DOUBLE,ColorType.BLUE);
		Circle c2 = new Circle(3.3f, BorderStyleType.DOTTED,ColorType.GREEN);

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
		System.out.println("Color of circle is "+c.getColor());
		System.out.println("Area of circle is " + c.calcArea() + "\n");

	}

	/*public static void printInfo(Circle[] circlesArray) {
		for (int i = 0; i <circlesArray.length ; i++) {
			 printDetails(circlesArray[i]);
		}
	}*/
	
	public static void printInfo(Circle[] circlesArray) {
		for(Circle c : circlesArray) {
			printDetails(c);
		}
	}

}
