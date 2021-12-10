package com.monocept.model;

public class Circle {
	private float radius;
	private String color;
	private float value;

	public void setRadius(float radius) {
		this.radius = checkDimension(radius);
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

	public void setColor(String color) {
		this.color = checkColor(color);
	}

	private String checkColor(String colorName) {
		if (!colorName.equals("red") && !colorName.equals("blue") && !colorName.equals("green") || colorName == "") {
			return colorName = "red";
		}
		return colorName;
	}

	public float getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public float calculateCircleArea() {
		return (float) (3.14 * radius * radius);
	}

	public float calculateCirclePerimeter() {
		return (float) (2 * 3.14 * radius);
	}
}