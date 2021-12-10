package com.monocept.model;


public class Board {

	private Cell[] cells = new Cell[9];

	public Board() {
		for (int i = 0; i < cells.length; i++) {
			cells[i] = new Cell();
		}
	}

	public void markCell(int position, Mark mark) {
		if (position >= 0 && position   < 9) {
			cells[position].setMark(mark);
			return;
		}
		throw new InvalidBoardPositionException();
	}

	public Cell getCell(int position) {
		return cells[position];
	}

	public Cell[] getCells() {
		return cells;
	}

}
