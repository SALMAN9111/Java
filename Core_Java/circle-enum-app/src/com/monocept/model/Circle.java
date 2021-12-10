package com.monocept.model;

public class Circle {
	private final float radius;
	private BorderStyleType border;
	private ColorType color;

	public Circle(float pRadius, BorderStyleType pBorder) {
		this(pRadius, pBorder, ColorType.RED);
	}

	public Circle(float pRadius, BorderStyleType pBorder, ColorType pColor) {
		radius = checkDimension(pRadius);
		setBorder(pBorder);
		setColor(pColor);
	}

	public void setBorder(BorderStyleType pBorder) {
		border = pBorder;
	}

	public void setColor(ColorType pColor) {
		color = pColor;
	}

	private float checkDimension(float value) {
		if (value < 1) {
			return value = 1;
		}
		if (value > 100) {
			return value = 100;
		}
		return value;
	}

	public BorderStyleType getBorder() {
		return border;
	}

	public ColorType getColor() {
		return color;
	}

	public float getRadius() {
		return radius;
	}

	public double calcArea() {
		return 3.14 * radius * radius;
	}
}
