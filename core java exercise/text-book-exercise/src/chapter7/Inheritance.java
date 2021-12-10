package chapter7;

import chapter7.InheritanceTest.Boat;

public class Inheritance {
	public class Boat {
		private int length;

		public void setLength(int len) {
			length = len;
		}

		public int getLength() {
			return length;
		}

		public void move() {
			System.out.print("drift ");
		}
	}

	public class Rowboat extends Boat {
		public void rowTheBoat() {
			System.out.print("stroke natasha");
		}
	}

	public class Sailboat extends Boat {
		public void move() {
			System.out.print("hoist sail ");
		}
	}


}
