package com.monocept.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Rectangle implements Serializable{
	private int width;
	private int height;
	@SuppressWarnings("unused")
	private int value;

	public void setWidth(int width) {
		this.width = checkDimension(width);
		// this.width = width;
	}

	public void setHeigth(int height) {
		this.height = checkDimension(height);
		// this.height = height;
	}

	private int checkDimension(int value) {
		if (value < 1) {
			return value = 1;
		} 
		if (value > 100) {
			return value = 100;
		}
		return value;

	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int calculateRectangleArea() {
		return width * height;
	}

}
