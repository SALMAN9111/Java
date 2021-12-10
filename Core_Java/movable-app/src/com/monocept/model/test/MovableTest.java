package com.monocept.model.test;

import com.monocept.model.Car;
import com.monocept.model.IMovable;
import com.monocept.model.Truck;
import com.monocept.model.Bike;

public class MovableTest {
	public static void main(String[] args) {
		IMovable arrayOfMovables[] = new IMovable[3];

		arrayOfMovables[0] = new Car();
		// arrayOfMovables[0].move();

		arrayOfMovables[1] = new Truck();
		// arrayOfMovables[1].move();

		arrayOfMovables[2] = new Bike();
		// arrayOfMovables[2].move();

		startTheRace(arrayOfMovables);
	}

	private static void startTheRace(IMovable[] movables) {
		System.out.println("The race has begun.");
		for (IMovable movable : movables) {
			movable.move();
		}
		System.out.println("Race End.");
	}

}
