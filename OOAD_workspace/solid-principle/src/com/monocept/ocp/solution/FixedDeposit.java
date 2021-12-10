package com.monocept.ocp.solution;

public class FixedDeposit {

	private int accNumber;
	private String name;
	private double amount;
	private int duration;
	private IfestivalRateCalculator rateCalc;
	
	public FixedDeposit(int accNumber, String name, double amount, int duration , IfestivalRateCalculator rateCalc) {
			this.accNumber = accNumber;
			this.name = name;
			this.amount = amount;
			this.duration = duration;
			this.rateCalc = rateCalc;
		}

	public int getAccNumber() {
		return accNumber;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public int getDuration() {
		return duration;
	}


	public double calcSimpleInterest() {
		return (amount * rateCalc.calculateRate() * duration) + amount ;
	}

}
