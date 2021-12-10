package com.monocept.model.test;

import com.monocept.model.Boy;
import com.monocept.model.IEmotionable;
import com.monocept.model.IMannerable;
import com.monocept.model.Man;

public class InterfaceTest {
	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();
		
		atTheParty(man);
		atTheParty(boy);
		//atTheMovie(man);
		atTheMovie(boy);
		
	}
	
	private static void atTheParty(IMannerable obj) {
		System.out.println("At the party hall.");
		obj.wish();
		obj.depart();
		System.out.println();
	}
	
	private static void atTheMovie(IEmotionable obj) {
		System.out.println("At the movie hall.");
		obj.cry();
		obj.laugh();
		System.out.println();
	}

}
