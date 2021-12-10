package com.monocept.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

public interface ILoader {
	public Set<String> load() throws FileNotFoundException, IOException;

}
