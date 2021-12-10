package com.monocept.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ReadFromFile implements ILoader {

	private String name;

	public ReadFromFile(String name) {
		this.name = name;
	}

	public Set<String> load() throws IOException {
		String record;
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(name));
		HashSet<String> hs = new HashSet<String>();
		while ((record = br.readLine()) != null) {
			hs.add(record);
		}
		return hs;
	}
}