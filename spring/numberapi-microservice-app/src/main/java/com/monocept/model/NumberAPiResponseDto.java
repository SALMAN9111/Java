package com.monocept.model;

public class NumberAPiResponseDto {
	private String text;
	private String number;
	private boolean found;
	private String type;
	
	public NumberAPiResponseDto() {
		
	}

	public NumberAPiResponseDto(String text, String number, boolean found, String type) {
		this.text = text;
		this.number = number;
		this.found = found;
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean isFound() {
		return found;
	}

	public void setFound(boolean found) {
		this.found = found;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
