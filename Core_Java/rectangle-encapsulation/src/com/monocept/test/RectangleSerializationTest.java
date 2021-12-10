package com.monocept.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.monocept.model.Rectangle;

public class RectangleSerializationTest {
	public static void main(String[] args) {
		Rectangle[] manyRectangles = new Rectangle[3];
		@SuppressWarnings("unused")
		Rectangle rectangle = new Rectangle();
		//int maxArea = 0;

		Rectangle rectangle1 = new Rectangle();
		rectangle1.setWidth(-10);
		rectangle1.setHeigth(110);
		manyRectangles[0] = rectangle1;

		Rectangle rectangle2 = new Rectangle();
		rectangle2.setWidth(10);
		rectangle2.setHeigth(10);
		manyRectangles[1] = rectangle2;

		Rectangle rectangle3 = new Rectangle();
		rectangle3.setWidth(99);
		rectangle3.setHeigth(99);
		manyRectangles[2] = rectangle3;

		// PrintInfo(rect);
		serialized(manyRectangles);
	}

	public static void PrintInfo(Rectangle manyRectangle) {
		System.out.println("Width is " + manyRectangle.getWidth());
		System.out.println("Height is " + manyRectangle.getHeight());
		System.out.println("Area is " + manyRectangle.calculateRectangleArea() + "\n");
	}

	public static void serialized(Rectangle[] object) {
		try {
			FileOutputStream file = new FileOutputStream("data//rectanglefile.bin");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(object);
			out.flush();
			out.close();
			System.out.println("Serialization is successfull");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
