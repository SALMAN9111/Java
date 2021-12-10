package com.monocept.model.test;

import com.monocept.model.GenderType;
import com.monocept.model.Human;

public class HumanCountTest {
	public static void main(String[] args) {
		Human human1 = new Human("xyz",1.5f,50f);
		System.out.println("Instance method count "+human1.getCount());
		System.out.println("Static method count "+Human.headCount()+"\n");
		
		Human human2 = new Human("abc",1.6f,60f,GenderType.MALE);
		System.out.println("Instance method count "+human1.getCount());
		System.out.println("Static method count "+Human.headCount()+"\n");
		
		
		Human human3 = new Human("pqr",1.8f,53f,GenderType.FEMALE);
		System.out.println("Instance method count "+human1.getCount());
		System.out.println("Static method count "+Human.headCount());
	}

}
