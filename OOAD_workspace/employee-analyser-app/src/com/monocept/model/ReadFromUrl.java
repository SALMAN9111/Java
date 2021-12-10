package com.monocept.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class ReadFromUrl implements ILoader {

	@Override
	public Set<String> load() throws FileNotFoundException, IOException {
		String record;
		URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		HashSet<String> hs = new HashSet<String>();
		while ((record = br.readLine()) != null) {
			hs.add(record);
		}
		return hs ;
	}

}
