package com.monocept.model;

import java.util.Date;
import java.util.UUID;

public class Student {
	private UUID uuid;
	private int rollNo;
	private String name;
	private int age;
	private String email;
	private Date date;
	private boolean isMale;
	
	public Student() {
		
	}

	public Student(UUID uuid, int rollNo, String name, int age, String email, Date date, boolean isMale) {
		this();
		this.uuid = uuid;
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.email = email;
		this.date = date;
		this.isMale = isMale;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return  " "+uuid + rollNo  + name + age  + email
				+  date +  isMale;
	}
	
}
