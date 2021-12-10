package com.monocept.model;

public class Rectangle {
	private int width;
	private int height;
	private final String bgColor;

	public Rectangle(int pWidth, int pHeight) {
		this(pWidth, pHeight, "red");
	}

	public Rectangle(int pWidth, int pHeight,String pColor) {
		System.out.println("Object Created.");
		this.bgColor = checkColor(pColor);
		setWidth(pWidth);
		setHeight(pHeight);
	}

	public String getColor() {
		return bgColor;
	}

	public void setWidth(int pWidth) {
		width = checkDimension(pWidth);
	}

	public void setHeight(int pHeight) {
		height = checkDimension(pHeight);
	}
	
	private String checkColor(String pColor) {
		if((!pColor.equalsIgnoreCase("red")) && (!pColor.equalsIgnoreCase("blue")) && (!pColor.equalsIgnoreCase("green"))){
			return pColor = "red";
		}
		return pColor;
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

	public int getHeigth() {
		return height;
	}

	public int calcArea() {
		return width * height;
	}

}
