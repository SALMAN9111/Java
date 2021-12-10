package com.monocept.dip.violation;

public class TxtLogger {
	
	public void log(Exception ex){
		System.out.println("Writing to file");
		System.out.println(ex.getMessage());
	}

}
