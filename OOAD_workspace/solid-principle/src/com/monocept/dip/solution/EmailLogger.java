package com.monocept.dip.solution;

public class EmailLogger implements ILogType {

	@Override
	public void writeLog(Exception ex) {	
		System.out.println("Sending mail");
	}

}
