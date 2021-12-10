package com.monocept.model.test;

import org.junit.Assert;
import org.junit.Test;

import com.monocept.model.Board;
import com.monocept.model.Mark;
import com.monocept.model.ResultAnalyser;


public class ResultAnalyserUnitTest {
	@Test
	public void testingForWinningCase() {
		//Arrange and Act
		Board board = new Board();
		board.markCell(0, Mark.X);
		board.markCell(5, Mark.O);
		board.markCell(1, Mark.X);
		board.markCell(7, Mark.O);
		board.markCell(2, Mark.X);
		
		ResultAnalyser ra = new ResultAnalyser();
		String result = ra.checkResult(board);
		//System.out.println(result);
		String expectedResult = "Winner";
		
		//Assert
		Assert.assertEquals(expectedResult,result);
	}
	
	@Test
	public void testingForGameInProgressCase() {
		//Arrange and Act
		Board board = new Board();
		board.markCell(1, Mark.X);
		board.markCell(5, Mark.O);
		board.markCell(2, Mark.X);
		board.markCell(7, Mark.O);
		board.markCell(3, Mark.X);
		
		ResultAnalyser ra = new ResultAnalyser();
		String result = ra.checkResult(board);
		System.out.println(result);
		String expectedResult = "Game is still in progress";
		
		//Assert
		Assert.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testingForGameDrawCase() {
		//Arrange and Act
		Board board = new Board();
		board.markCell(0, Mark.X);
		board.markCell(1, Mark.X);
		board.markCell(2, Mark.O);
		board.markCell(3, Mark.O);
		board.markCell(4, Mark.X);
		board.markCell(5, Mark.X);
		board.markCell(6, Mark.X);
		board.markCell(7, Mark.O);
		board.markCell(8, Mark.O);
		
		
		ResultAnalyser ra = new ResultAnalyser();
		String result = ra.checkResult(board);
		System.out.println(result);
		String expectedResult = "Game Draw";
		
		//Assert
		Assert.assertEquals(expectedResult, result);
	}
	

}
