package com.monocept.lsp.violation.test;

import com.monocept.lsp.violation.Rectangle;
import com.monocept.lsp.violation.Square;

public class LspViolationTest {
	public static void main(String[] args) {
		System.out.println("Rectangle:");
		changeInOneDimensionShouldNotReflectInAnotherOfRectangle(new Rectangle(10,50));
		System.out.println("\nSqaure:");
		changeInOneDimensionShouldNotReflectInAnotherOfRectangle(new Square(10));
	}
	
	private static void changeInOneDimensionShouldNotReflectInAnotherOfRectangle(Rectangle rectangle) {
		int beforeChange = rectangle.getHeight();
		rectangle.setWidth(rectangle.getWidth()+10);
		int afterChange = rectangle.getHeight();
		
		System.out.println(beforeChange);
		System.out.println(afterChange);
		System.out.println(beforeChange == afterChange);
		
	}

}
