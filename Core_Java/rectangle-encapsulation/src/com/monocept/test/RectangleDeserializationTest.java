package com.monocept.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.monocept.model.Rectangle;

public class RectangleDeserializationTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Rectangle[] rectangles = deserializeRectangleFromFile();
		printInfo(rectangles);

	}

	private static void printInfo(Rectangle[] rectangles) {
		for (int i = 0; i < rectangles.length; i++) {
			System.out.println("Width is " + rectangles[i].getWidth());
			System.out.println("Height is " + rectangles[i].getHeight());
			System.out.println("Area is " + rectangles[i].calculateRectangleArea()+"\n");
		}
	}

	private static Rectangle[] deserializeRectangleFromFile() {
		try {
			@SuppressWarnings("resource")
			ObjectInputStream out = new ObjectInputStream(new FileInputStream("data//rectanglefile.bin"));
			Rectangle[] rectangle = (Rectangle[]) out.readObject();
			System.out.println(rectangle.length);
			return (Rectangle[]) rectangle;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;

	}

}
