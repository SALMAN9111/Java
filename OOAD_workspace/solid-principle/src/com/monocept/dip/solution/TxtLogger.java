package com.monocept.dip.solution;

public class TxtLogger implements ILogType {

	@Override
	public void writeLog(Exception ex) {
		System.out.println("Writing to file");
		System.out.println(ex.getMessage());

	}

}
