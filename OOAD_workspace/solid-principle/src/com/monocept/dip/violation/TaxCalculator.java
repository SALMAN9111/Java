package com.monocept.dip.violation;

public class TaxCalculator {
	private LogType log;
	 
	public TaxCalculator(LogType log) {
		this.log = log;
	}
	
	public int calculate(int amount, int rate) {
		int result = 0;
		try {
			result = amount/rate;
		}
		catch(Exception ex) {
			if(log == LogType.EMAIL) {
				new EmailLogger().log(ex);
				return -1;
			}
			
			new TxtLogger().log(ex);
			return -1;
		}
		return result;
	}

}
