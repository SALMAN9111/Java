package com.monocept.model;

@SuppressWarnings("serial")
public class InvalidBoardPositionException extends RuntimeException {
		String detailMessage;
		public InvalidBoardPositionException() {
			buildMessage();
		}

		private void buildMessage() {
			detailMessage = "Invalid position of board";
		}

		@Override
		public String getMessage() {
			return detailMessage;
		}
		
		

}
