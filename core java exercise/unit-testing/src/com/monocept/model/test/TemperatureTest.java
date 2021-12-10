package com.monocept.model.test;

import com.monocept.model.Temperature;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class TemperatureTest {

	@Test
	public void temperatureCalcution() throws Throwable {
		Temperature temp = new Temperature();

		double temperature = 80.0;
		String type = "";
		double result = temp.calcTemperature(temperature, type);

		assertEquals(177.0, result, 1.0);
	}

}
