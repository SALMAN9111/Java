package com.monocept.model;

import java.util.Calendar;
import java.util.Date;

public class TimePrinter //implements Runnable {
{
	Calendar c = Calendar.getInstance();
	Date date = c.getTime();
	
	public TimePrinter() {
		while (true) {
			System.out.println(date);
		}
	}

//	@Override
//	public void run() {
//		TimePrinter time = new TimePrinter();
//		
//	}
}