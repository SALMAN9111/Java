package com.monocept.model.test;


import org.junit.Assert;
import org.junit.Test;

import com.monocept.model.Cell;
import com.monocept.model.CellPositionIsAlreadyTakenException;
import com.monocept.model.Mark;

public class CellUnitTest {

	@Test
	public void testingConstructorOfCell() {
		// Arrange and Act
		Cell c = new Cell();
		Mark expectedMark = Mark.X;
		c.setMark(Mark.X);

		// Assert
		Assert.assertEquals(expectedMark, c.getMark());

	}

	@Test
	public void testingForEmptyCell() {
		// Arrange and Act
		Cell c = new Cell();

		// Assert
		Assert.assertEquals(Mark.EMPTY, c.getMark());
	}
	
	@Test
	public void cellClassShouldThrowExceptionWhenMarkedCellIsTriedToMarkAgain() {
		//Arrange and Act
		Cell c = new Cell();
		c.setMark(Mark.X);
		String exceptionMessage = "Slot is already taken";
		Exception ex = Assert.assertThrows(CellPositionIsAlreadyTakenException.class, 
				()->{c.setMark(Mark.X);});
		String expectedMessage = ex.getMessage();
		//Assert
		Assert.assertEquals(expectedMessage, exceptionMessage);
	}

}
