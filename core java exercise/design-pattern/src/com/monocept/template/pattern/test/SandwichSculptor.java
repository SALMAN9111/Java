package com.monocept.template.pattern.test;

import com.monocept.template.pattern.ItalianHoagie;
import com.monocept.template.pattern.VeggieHoagie;

public class SandwichSculptor {
	
	public static void main(String[] args){
		
		ItalianHoagie cust12Hoagie = new ItalianHoagie();
		
		cust12Hoagie.makeSandwich();
		
		System.out.println();
		
		VeggieHoagie cust13Hoagie = new VeggieHoagie();
		
		cust13Hoagie.makeSandwich();
		
	}
	
}
