package com.monocept.adapter.pattern;

import com.monocept.external.Hat;

public class HatAdapter implements Item {
	private Hat hat;
	
	public HatAdapter(Hat hat) {
		this.hat = hat;
	}
	
	@Override
	public String itemName() {
		return hat.getShortName();
	}

	@Override
	public double itemPrice() {
		return hat.getPrice();
	}

}
