package com.array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateChecker {
	
	public static void main(String[] args) throws ParseException {
		String date = "2024-10-16";
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		String checkDate = f.format(new Date());
		System.out.println(checkDate);
		
		if(date.compareTo(checkDate) > 0) {
			System.out.println("CREATE");
		}
		
	}
	
}
