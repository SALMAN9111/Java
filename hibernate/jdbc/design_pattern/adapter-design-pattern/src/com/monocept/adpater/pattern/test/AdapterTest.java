package com.monocept.adpater.pattern.test;

import com.monocept.adapter.pattern.HatAdapter;
import com.monocept.adapter.pattern.ShoppingCart;
import com.monocept.external.Hat;

public class AdapterTest {

	public static void main(String[] args) {
		ShoppingCart shop = new ShoppingCart();
		HatAdapter ha = new HatAdapter(new Hat("golden", "golden premium", 999));
		shop.add(ha);
		System.out.println("Name of the hat : "+ha.itemName());
		System.out.println("The price of the hat : "+shop.totalPrice());
	}

}
