package com.monocept.test;

public class URLReadingTest {
	public static void main(String[] args) {
		System.out.println("Enter a URl");

		if (args.length != 0) {
			for (int i = 0; i < args.length; i++) {
				int nameOfCompanyStart = args[i].indexOf(".");
				int nameOfCompanyEnd = args[i].indexOf("?");
				String companyName = args[i].substring(nameOfCompanyStart + 1, nameOfCompanyEnd);
				if (companyName.isEmpty() != true) {
					System.out.println("Company Name: " + companyName);
				}

				int nameOfDeveloperStart = args[i].indexOf("=");
				int nameOfDeveloperEnd = args[i].indexOf("&");
				String developerName = args[i].substring(nameOfDeveloperStart + 1, nameOfDeveloperEnd);
				if (developerName.isEmpty() != true) {
					System.out.println("Developer Name: " + developerName);
				}

				int nameOfLocation = args[i].indexOf("n=");
				String locationName = args[i].substring(nameOfLocation + 2);
				if (locationName.isEmpty() != true) {
					System.out.println("Location Name: " + locationName + "\n");
				}
			}
		}

		else {
			System.out.println("You have not enter URL");
		}
	}
}
//www.monocept.com?developer=youName&location=hydrabad