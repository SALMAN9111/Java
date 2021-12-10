package com.moncept.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingAndReadingFileTest {
	public static void main(String[] args) throws IOException {
		WritingToFile();
		ReadingFromFile();

	}

	private static void WritingToFile() throws IOException {
		FileWriter fw = new FileWriter("data//name.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("a");
		bw.append(" dhf");
		bw.close();
	}

	private static void ReadingFromFile() throws IOException {
		File readFile = new File("data//name.txt");
		Scanner scanner = new Scanner(readFile);
		System.out.println("Content of File are");
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}

	}
}
