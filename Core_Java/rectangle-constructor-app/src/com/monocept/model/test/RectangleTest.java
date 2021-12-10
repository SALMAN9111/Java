package com.monocept.model.test;

import java.util.Scanner;

import com.monocept.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		 PrintInfo(new Rectangle(20,30));
		 PrintInfo(new Rectangle(-10,110));
		 @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		 scanner.nextLine();
	}
	
	public static void PrintInfo(Rectangle rectangle) {
		System.out.println("Width is "+rectangle.getWidth());
		System.out.println("Heigth is "+rectangle.getHeigth());
		System.out.println("Area of rectangle is "+rectangle.calcArea()+"\n");
	}

}
