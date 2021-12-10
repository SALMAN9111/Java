package com.monocept.factory.pattern.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.monocept.factory.pattern.AudiFactory;
import com.monocept.factory.pattern.BmwFactory;
import com.monocept.factory.pattern.IAutoMobile;
import com.monocept.factory.pattern.IAutoMobileFactory;
import com.monocept.factory.pattern.TeslaFactory;

public class FactoryTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		IAutoMobileFactory factory1 = loadFactoryFromFile();
		IAutoMobile auto = factory1.make();
		auto.start();
		auto.stop();
		
		IAutoMobileFactory factory2 = loadFactoryFromFile();
		IAutoMobile auto1 = factory2.make();
		auto1.start();
		auto1.stop();
		
		System.out.println(factory1 == factory2);
	}

	private static IAutoMobileFactory loadFactoryFromFile() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		InputStream input = new FileInputStream("data//app.properties");
		Properties prop = new Properties();
		prop.load(input);
		IAutoMobileFactory factory = null;
		
		String TypeOfFactory = prop.getProperty("factory");
		Class c = Class.forName(TypeOfFactory);
		System.out.println(c);
		if(factory == null) {
			factory = (IAutoMobileFactory) 	c.newInstance();
			
		}
		return factory;
	}

}
