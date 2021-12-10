package com.monocept.model;

public class Game {
	private Board board;
	private Player players[];
	private String currentPlayer = "player1";
	private ResultAnalyser status;
	private int switchPlayer = 0;

	public Game(Board board, ResultAnalyser status, Player[] players) {
		this.board = board;
		this.status = status;
		this.players = players;
	}

	public void play(int cellLocation) {
		if (this.getStatus() != "Game Draw" && this.getStatus() != "Winner") {
			if (switchPlayer % 2 == 0) {
				board.markCell(cellLocation, Mark.X);
				currentPlayer = players[0].getPlayerName();
				switchPlayer++;
				return;
			} else {
				board.markCell(cellLocation, Mark.O);
				// System.out.println(players[1].getPlayerName());
				currentPlayer = players[1].getPlayerName();
				switchPlayer++;
				return;
			}
		}
		String result = this.getStatus();
		ResultPage resultPage = new ResultPage(currentPlayer, result);
		resultPage.setVisible(true);
	}

	public String getCurrentPlayer() {
		return currentPlayer;
	}

	public String getStatus() {
		return status.checkResult(this.board);
	}

}
