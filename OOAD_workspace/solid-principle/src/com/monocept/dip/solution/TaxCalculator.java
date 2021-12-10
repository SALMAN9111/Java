package com.monocept.dip.solution;

public class TaxCalculator {
	private ILogType log;

	public TaxCalculator(ILogType log) {
		this.log = log;
	}

	public int calculate(int amount, int rate) {
		int result = 0;
		try {
			result = amount / rate;
		} catch (Exception ex) {
			log.writeLog(ex);
			return -1;
		}

		return result;
	}
}
