package com.monocept.model.test;

import java.util.Scanner;

import com.monocept.model.Rectangle;

public class RectangleColorTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(20, 30, "black");
		PrintInfo(r1);

		r1.setWidth(r1.getWidth() + 5);
		r1.setHeight(r1.getHeigth() + 5);
		PrintInfo(r1);

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		scanner.hasNextLine();
	}

	public static void PrintInfo(Rectangle rectangle) {
		System.out.println("Width is " + rectangle.getWidth());
		System.out.println("Heigth is " + rectangle.getHeigth());
		System.out.println("Color is " + rectangle.getColor());
		System.out.println("Area of rectangle is " + rectangle.calcArea() + "\n");
	}

}
