package com.monocept.factory.pattern.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.monocept.factory.pattern.IAutoMobileFactory;

public class LoadFactoryFromFile {
	
	
	public IAutoMobileFactory readFromFile() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		InputStream input = new FileInputStream("data//app.properties");
		Properties prop = new Properties();
		prop.load(input);
		IAutoMobileFactory factory = null;
		
		String TypeOfFactory = prop.getProperty("factory");
		Class c = Class.forName(TypeOfFactory);
			
		if(factory == null) {
			factory = (IAutoMobileFactory) 	c.newInstance();
			
		}
		return factory;
	}

	/*public IAutoMobileFactory readPackageName() throws IOException {
			Properties prop = new Properties();
			String packageNames = "app.properties";
			InputStream inputStream  = getClass().getClassLoader().getResourceAsStream(packageNames);
			
			if(inputStream != null) {
				prop.load(inputStream);
			}
			else {
				throw new FileNotFoundException("Property file "+ packageNames +" not found in the classpath");
			}
			
			
		return null;
		
	}*/
}
