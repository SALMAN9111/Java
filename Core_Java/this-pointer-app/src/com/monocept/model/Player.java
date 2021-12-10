package com.monocept.model;

public class Player {
	private int id;
	private int age;
	private GenderType gender;
	private String name;

	public Player(int id, String name) {
		this(id, name, GenderType.MALE, 18);
	}

	public Player(int id, String name, GenderType gender, int age) {
		System.out.println("Object Created " + this.hashCode());
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public GenderType getGender() {
		return gender;
	}

	public Player elderPlayer(Player p2 ) {
		/*if(this.age<p2.age) {
			return p2;
		}*/
		return (this.age<p2.age)? p2 : this;
		
	}
}
