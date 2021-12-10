package com.monocept.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSalaryTest {
	public static void main(String[] args) throws IOException {
		String record;
		BufferedReader br = new BufferedReader(new FileReader("data//employeedata.txt"));
		System.out.println("\t\t Max Salary Record\n");

		List<List<String>> arlist = new ArrayList<>();

		int maxSal = 0;
		List<String> name = new ArrayList<String>();

		while ((record = br.readLine()) != null) {
			String[] words = record.split(",");
			arlist.add(Arrays.asList(words));
			
			for (int i = 0; i < words.length; i = i + 3) {
				if (maxSal < Integer.parseInt(words[5])) {
					name.add(words[1]);
					maxSal = Integer.parseInt(words[5]);
				} /*else {
					maxSal = maxSal;
				}*/
			}

		}
		System.out.println("Employee name with high salary:" + name.get(name.size()-1));
		br.close();
	}

}
