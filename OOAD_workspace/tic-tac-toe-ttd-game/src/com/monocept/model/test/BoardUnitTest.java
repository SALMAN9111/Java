package com.monocept.model.test;

import org.junit.Assert;
import org.junit.Test;

import com.monocept.model.Board;
import com.monocept.model.CellPositionIsAlreadyTakenException;
import com.monocept.model.InvalidBoardPositionException;
import com.monocept.model.Mark;

public class BoardUnitTest {

	@Test
	public void testingConstructor() {
		// Arrange and Act
		Board board = new Board();
		board.markCell(0, Mark.O);
		board.markCell(4, Mark.X);
		System.out.println(board.getCell(5).getMark().toString());
		System.out.println(board.getCell(0).getMark());

		// Assert
		Assert.assertEquals(board.getCell(4).getMark(), Mark.X);
		Assert.assertEquals(board.getCell(5).getMark().toString(), "EMPTY");
	}

	@Test
	public void itShouldThrowExceptionWhenInputValueGreaterThanNineOrLessThanOne() {
		// Arrange and Act
		Board board = new Board();
		Exception ex = Assert.assertThrows(InvalidBoardPositionException.class, () -> {
			board.markCell(10, Mark.O);
		});

		Exception ex1 = Assert.assertThrows(InvalidBoardPositionException.class, () -> {
			board.markCell(-1, Mark.O);
		});

		String expectedMessage = "Invalid position of board";
		String exceptionMessage = ex.getMessage();
		String exceptionMessage1 = ex1.getMessage();
		

		// Assert
		Assert.assertEquals(exceptionMessage, expectedMessage);
		Assert.assertEquals(exceptionMessage1, expectedMessage);
	}

	@Test
	public void cellClassShouldThrowExceptionWhenMarkedCellIsTriedToMarkAgain() {
		// Arrange and Act

		Board board = new Board();
		board.markCell(5, Mark.X);
		String exceptionMessage = "Slot is already taken";

		Exception ex = Assert.assertThrows(CellPositionIsAlreadyTakenException.class, () -> {
			board.markCell(5, Mark.X);
		});
		String expectedMessage = ex.getMessage();

		// Assert
		Assert.assertEquals(expectedMessage, exceptionMessage);
	}

}
