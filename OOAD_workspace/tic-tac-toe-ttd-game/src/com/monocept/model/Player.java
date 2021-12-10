package com.monocept.model;

public class Player {
	private Mark mark;
	private String playerName;

	public Player(Mark mark, String playerName) {
		this.mark = mark;
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public Mark getMark() {
		return mark;
	}

}
