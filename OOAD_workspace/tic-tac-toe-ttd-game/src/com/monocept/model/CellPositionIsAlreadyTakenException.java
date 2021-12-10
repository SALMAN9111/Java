package com.monocept.model;

@SuppressWarnings("serial")
public class CellPositionIsAlreadyTakenException extends RuntimeException {
	String detailMessage;
	
	public CellPositionIsAlreadyTakenException() {
		buildMessage();
	}

	private void buildMessage() {
		detailMessage = "Slot is already taken";
		
	}

	@Override
	public String getMessage() {
		return detailMessage;
	}
}
