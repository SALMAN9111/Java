package com.monocept.test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class UpdateFileTest {
	public static void main(String[] args) throws IOException {

		/*Path oldFilePath = Paths.get("data//emp.txt");
		Path newFilePath = Paths.get("data//emp1.txt");
		Charset charset = StandardCharsets.UTF_8;

		String content = new String(Files.readAllBytes(oldFilePath), charset);
		content = content.replaceAll("KING", "SALMAN");
		Files.write(newFilePath, content.getBytes(charset));
		//Files.write(path, content.getBytes(charset));*/

		updateTOFile();

	}

	public static void updateTOFile() throws IOException {
		Path path = Paths.get("data//emp.txt");
		Charset charset = Charset.forName("UTF-8");
		
		String line = null;
		FileWriter fw = new FileWriter("data//emp1.txt");
		Writer output = new BufferedWriter(fw);
		Scanner scanner = new Scanner(path, charset.name());
		while(scanner.hasNextLine()) {
			line = scanner.nextLine();
			line = line.replaceAll("KING", "SALMAN");
			output.write(line);
			((BufferedWriter) output).newLine();
					
		}
		scanner.close();
		output.close();
	}
}
