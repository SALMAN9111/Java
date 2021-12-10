package com.monocept.model.test;

import org.junit.Assert;
import org.junit.Test;

import com.monocept.model.Board;
import com.monocept.model.Game;
import com.monocept.model.Mark;
import com.monocept.model.Player;
import com.monocept.model.ResultAnalyser;

public class GameUnitTest {
	
	@Test
	public void testingGame() {
		//Arrange and Act
		Board board = new Board();
		ResultAnalyser status = new ResultAnalyser();
		Player players[] = new Player[2];
		players[0] = new Player(Mark.X, "player1");
		players[1] = new Player(Mark.O, "player2");
		
		Game game = new Game(board, status, players);
		game.play(0);
		Mark exceptedMark = Mark.X;
		String exceptedPlayer = "player1";
		String result = game.getStatus();
		
		//Assert
		Assert.assertEquals(exceptedMark, board.getCell(0).getMark() );
		Assert.assertEquals(exceptedPlayer, game.getCurrentPlayer());
		Assert.assertEquals(result,"Game is still in progress");
		
	}
	
	@Test
	public void testingForPlayerSwitch() {
		//Arrange and Act
		Board board = new Board();
		ResultAnalyser status = new ResultAnalyser();
		Player players[] = new Player[2];
		players[0] = new Player(Mark.X, "player1");
		players[1] = new Player(Mark.O, "player2");
		
		Game game = new Game(board, status, players);
		game.play(0);
		
		game.play(1);
		Mark exceptedMark = Mark.O;
		String exceptedPlayer = "player2";
		String result = game.getStatus();
		
		//Assert
		Assert.assertEquals(exceptedMark, board.getCell(1).getMark());
		Assert.assertEquals(exceptedPlayer, game.getCurrentPlayer());
		Assert.assertEquals(result,"Game is still in progress");
		
	}
//	
	@Test
	public void testingForWinnerCase() {
		//Arrange and Act
		Board board = new Board();
		ResultAnalyser status = new ResultAnalyser();
		Player players[] = new Player[2];
		players[0] = new Player(Mark.X, "player1");
		players[1] = new Player(Mark.O, "player2");
		
		Game game = new Game(board, status, players);
		game.play(0);
		
		game.play(1);
		game.play(3);
		game.play(5);
		game.play(6);
		Mark mark = Mark.X;
		game.play(7);
		//Mark mark = Mark.O;
		
		String exceptedPlayer = "player1";
		String result = game.getStatus();
		//System.out.println(result);
		
		//Assert
		Assert.assertEquals(mark, board.getCell(6).getMark());
		Assert.assertEquals(exceptedPlayer, game.getCurrentPlayer());
		Assert.assertEquals(result,"Winner");
		
	}

}
