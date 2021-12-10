package com.monocept.lsp.solution.test;

import com.monocept.lsp.solution.Rectangle;
import com.monocept.lsp.solution.Square;

public class LspSolutionTest {
	public static void main(String[] args) {
		System.out.println("Rectangle:");
		changeInOneDimensionShouldNotReflectInAnotherOfRectangle(new Rectangle(10,50));
		System.out.println("\nSqaure:");
		changeInOneDimensionShouldReflectInAnotherOfSqaure(new Square(10));
	}
	
	private static void changeInOneDimensionShouldNotReflectInAnotherOfRectangle(Rectangle rectangle) {
		int beforeChange = rectangle.getHeight();
		rectangle.setWidth(rectangle.getWidth()+10);
		int afterChange = rectangle.getHeight();
		
		System.out.println(beforeChange);
		System.out.println(afterChange);
		System.out.println(beforeChange == afterChange);
		
	}
	
	private static void changeInOneDimensionShouldReflectInAnotherOfSqaure(Square square) {
		int beforeChange = square.getSide();
		square.setSide(square.getSide()+10);
		int afterChange = square.getSide();
		
		System.out.println(beforeChange);
		System.out.println(afterChange);
		System.out.println(beforeChange != afterChange);
		
	}

}
