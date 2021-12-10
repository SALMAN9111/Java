package com.monocept.model;

public class Cell {
	private Mark cellMark = Mark.EMPTY;

	public Mark getMark() {
		return cellMark;
	}

	public void setMark(Mark cellMark) {
		if (this.getMark() == Mark.EMPTY) {
			this.cellMark = cellMark;
			return;
		}
		throw new CellPositionIsAlreadyTakenException();
	}

}
