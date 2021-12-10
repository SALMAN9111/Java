package com.monocept.model.test;

import com.monocept.model.Circle;

public class CircleTest {

	public static void main(String[] args) {
		float maxArea = 0;
		float minArea = 100000000f;
		int biggestCircle = 0;
		int smallestCircle = 0;

		Circle[] manyCircles = new Circle[3];
		Circle circle1 = new Circle();

		circle1.setRadius(-10f);
		circle1.setColor("black");
		manyCircles[0] = circle1;

		Circle circle2 = new Circle();
		circle2.setRadius(1000f);
		circle2.setColor("blue");
		manyCircles[1] = circle2;

		Circle circle3 = new Circle();
		circle3.setRadius(82f);
		circle3.setColor("white");
		manyCircles[2] = circle3;

		PrintInfo(manyCircles);

		for (int i = 0; i < manyCircles.length; i++) {
			if (maxArea < manyCircles[i].calculateCircleArea()) {
				maxArea = manyCircles[i].calculateCircleArea();
				biggestCircle = i + 1;
			}
		}

		for (int i = 0; i < manyCircles.length; i++) {
			if (minArea > manyCircles[i].calculateCircleArea()) {
				minArea = manyCircles[i].calculateCircleArea();
				smallestCircle = i + 1;
			}
		}
		System.out.println("Biggest circle is " + biggestCircle + " with area of " + maxArea);
		System.out.println("Smallest circle is " + smallestCircle + " with area of " + minArea);
	}

	private static void PrintInfo(Circle[] manyCircles) {
		for (int i = 0; i < manyCircles.length; i++) {
			System.out.println("Radius of cirlce is " + manyCircles[i].getRadius());
			System.out.println("Color of circle is " + manyCircles[i].getColor());
			System.out.println("Area of cirlce is " + manyCircles[i].calculateCircleArea());
			System.out.println("Perimeter of circle is " + manyCircles[i].calculateCirclePerimeter() + "\n");
		}

	}

}
