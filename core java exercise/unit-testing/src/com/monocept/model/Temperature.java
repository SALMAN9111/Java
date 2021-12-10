package com.monocept.model;

public class Temperature {
	
	public double calcTemperature(double temperature, String type) {
		if(type.equals("F")) {
			return (temperature - 32) * (5.0/9.0);
		}
		return (temperature * (9.0/5.0)) + 32;
	}

}
