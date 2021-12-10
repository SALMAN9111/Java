package com.monocept.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.monocept.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle[] manyRectangles = new Rectangle[3];
		@SuppressWarnings("unused")
		Rectangle rectangle = new Rectangle();
		int maxArea = 0;

		Rectangle rectangle1 = new Rectangle();
		rectangle1.setWidth(-10);
		rectangle1.setHeigth(110);
		manyRectangles[0] = rectangle1;

		Rectangle rectangle2 = new Rectangle();
		rectangle2.setWidth(10);
		rectangle2.setHeigth(10);
		manyRectangles[1] = rectangle2;

		Rectangle rectangle3 = new Rectangle();
		rectangle3.setWidth(14);
		rectangle3.setHeigth(10);
		manyRectangles[2] = rectangle3;

		//serialized(manyRectangles);
		Rectangle rect = (Rectangle) deserializedRectangle();
		PrintInfo(rect);

		for (int i = 0; i < manyRectangles.length; i++) {
			if (maxArea < manyRectangles[i].calculateRectangleArea()) {
				maxArea = manyRectangles[i].calculateRectangleArea();
			}
		}
		System.out.println("Highest area of rectangle is " + maxArea);
	}

	public static void PrintInfo(Rectangle manyRectangle) {
			System.out.println("Width is " + manyRectangle.getWidth());
			System.out.println("Height is " + manyRectangle.getHeight());
			System.out.println("Area is " + manyRectangle.calculateRectangleArea() + "\n");
	}

	
	
	private static Rectangle deserializedRectangle() {
		try {
			int i = 0;
			@SuppressWarnings("resource")
			ObjectInputStream out = new ObjectInputStream(new FileInputStream("rectanglefile.bin"));
			Rectangle rectangle = (Rectangle) out.readObject();
			i = i + 1;
;			return rectangle;
			// System.out.println(acc.getName()+" "+acc.getAccountNumber());
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}


