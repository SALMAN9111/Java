package com.monocept.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class TodoItem implements Serializable{
	private int id;
	private String description;
	private Date createdDate;
	private boolean hasCompleted;

	public TodoItem(int id, String description, Date d, boolean hasCompleted) {
		//super();
		this.id = id;
		this.description = description;
		this.createdDate = d;
		this.hasCompleted = hasCompleted;
		
	}


	@Override
	public String toString() {
		if(isHasCompleted() == true)
			return  id +" "+ description +" "+ createdDate+" Completed";
		return id +" "+ description +" "+ createdDate;
	}


	public int getId() {
		return id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public boolean isHasCompleted() {
		return hasCompleted;
	}

	public void setHasCompleted(boolean hasCompleted) {
		this.hasCompleted = hasCompleted;
		//isHasCompleted();
		
	}

}
