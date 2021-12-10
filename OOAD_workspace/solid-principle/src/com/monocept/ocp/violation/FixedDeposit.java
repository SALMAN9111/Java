package com.monocept.ocp.violation;


public class FixedDeposit {
	private int accNumber;
	private String name;
	private double amount;
	private int duration;
	private FestivalType festival;
	
	public FixedDeposit(int accNumber, String name, double amount, int duration , FestivalType festival) {
		this.accNumber = accNumber;
		this.name = name;
		this.amount = amount;
		this.duration = duration;
		this.festival = festival;
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

	public FestivalType getFestival() {
		return festival;
	}
	
	public double calcRate() {
		if(getFestival() == FestivalType.DIWALI) {
			 double rate = (amount*duration*8.5)/100;
			 return rate;
		}
		
		if(getFestival() == FestivalType.EID) {
			double rate = (amount*duration*8)/100;
			return rate;
			}
		

		if(getFestival() == FestivalType.NEW_YEAR) {
			double rate = (amount*duration*9)/100;
			return rate;
			}
		
		double rate = (amount*duration*7)/100;
		return rate;
		
	}
	
	public double calcSimpleInterest() {
		return amount + calcRate();
	}
	
	

}
