package com.monocept.lsp.solution;

public class Square implements IPolygon{
	private int side;
	
	public Square(int side) {
		this.setSide(side);
	}
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public int calculateArea() {
		return side * side;
	}
	

}
