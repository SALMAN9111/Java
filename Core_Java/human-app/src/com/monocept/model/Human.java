package com.monocept.model;

public class Human {
	private final String name;
	private float height;
	private float wieght;
	private GenderType gender;
	private static int count;
	
	public Human(String name, float height, float wieght) {
		this(name,height,wieght,GenderType.FEMALE);
	}
	
	public Human(String name, float height, float wieght, GenderType gender) {
		this.name = name;
		this.height = height;
		this.wieght = wieght;
		this.gender = gender;
		count = count + 1;
	}
	
	public void eat(float wiegth) {
		this.wieght = (float) (wieght + (0.05 * wieght));
	}
	
	public void play(float height) {
		this.height = (float) (height + (0.02 * height));
	}
	
	public String getName() {
		return name;
	}
	
	public GenderType getGender() {
		return gender;
		
	}
	
	public float getWieght() {
		return wieght;
	}
	
	public float getHeight() {
		return height;
	}
	
	public int getCount() {
		return count;
	}
	
	public static int headCount() {
		return count;
	}
	
}
