package com.monocept.service;

import java.util.Date;
import java.util.UUID;

public class StudentDTO {

	private int rollNo;
	private String name;
	private int age;
	private String email;
	private Date date;
	private boolean isMale;
	private UUID uuid;

	public StudentDTO(int rollNo, String name, int age, String email, Date date, boolean isMale, UUID uuid) {

		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.email = email;
		this.date = date;
		this.isMale = isMale;
		this.uuid = uuid;
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
		return rollNo + name + age + email + date + isMale + uuid;
	}

}