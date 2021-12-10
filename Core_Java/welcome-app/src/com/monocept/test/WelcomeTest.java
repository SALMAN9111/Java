package com.monocept.test;

public class WelcomeTest {
	public static void main(String[] args) {
		String name = "Salman";
		String details = "-help";
		System.out.println("welocme to monocept " + name);

		if (args.length != 0) {
			String help = args[0];

			if (help.equals(details)) {
				System.out.println("\n\"Details of Developer and when it build\"");
				System.out.println("Developer of the program is Burkaposh");
				System.out.println("This program is written on 8/25/2021");
			}
		}
	}
}
