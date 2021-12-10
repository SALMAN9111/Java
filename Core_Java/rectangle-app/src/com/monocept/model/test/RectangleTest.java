package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle smallRectangleShape = new Rectangle();
		smallRectangleShape.width = 10;
		smallRectangleShape.height = 20;
		PrintRectangleDetails(smallRectangleShape);

		Rectangle bigRectangleShape = new Rectangle();
		bigRectangleShape.width = 100;
		bigRectangleShape.height = 50;
		PrintRectangleDetails(bigRectangleShape);

		Rectangle temp = bigRectangleShape;
		System.out.println("Width in temp " + temp.width);
		System.out.println("Width in big Rectangle " + bigRectangleShape.width + "\n");
		PrintRectangleDetails(temp);

		// temp = null;
		System.out.println("Width in temp " + temp.width);
		System.out.println("Hascode of width in temp" + temp.hashCode());
		System.out.println("Width in big Rectangle " + bigRectangleShape.width);

		System.out.println(new Rectangle().calculateRectangleArea());
		PrintRectangleDetails(new Rectangle());

	}

	private static void PrintRectangleDetails(Rectangle rectangle) {
		System.out.println("Width is " + rectangle.width);
		System.out.println("Heigth is " + rectangle.height);
		System.out.println("Area is " + rectangle.calculateRectangleArea());
		System.out.println("HAscode is " + rectangle.hashCode() + "\n");
	}
}
