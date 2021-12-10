package com.monocept.model.test;

import com.monocept.model.GenderType;
import com.monocept.model.Human;

public class HumanTest {
	public static void main(String[] args) {
		
		Human human1 = new Human("Mithali",1.6f,50f);
		printInfo(human1);
		
		human1.eat(50f);
		printInfo(human1);
		
		human1.play(1.6f);
		printInfo(human1);
		
		Human human2 = new Human("smith",1.6f,60f,GenderType.MALE);
		printInfo(human2);
		
		human2.eat(50f);
		printInfo(human2);
		
	}
	
	public static void printInfo(Human human) {
		System.out.println("Name is "+human.getName());
		System.out.println("Height is "+human.getHeight());
		System.out.println("Wieght is "+human.getWieght());
		System.out.println("Gender is "+human.getGender()+"\n");
	}
}
