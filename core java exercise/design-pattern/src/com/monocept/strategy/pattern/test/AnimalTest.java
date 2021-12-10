package com.monocept.strategy.pattern.test;

import com.monocept.strategy.pattern.Animal;
import com.monocept.strategy.pattern.Bird;
import com.monocept.strategy.pattern.Dog;
import com.monocept.strategy.pattern.ItFlys;

public class AnimalTest{
	
	public static void main(String[] args){
		
		Animal dog = new Dog();
		Animal bird = new Bird();
		
		System.out.println("Dog: " + dog.tryToFly());
		System.out.println("Bird: " + bird.tryToFly());

		dog.setFlyingAbility(new ItFlys());
		System.out.println("Dog: " + dog.tryToFly());
		
	}
	
}
