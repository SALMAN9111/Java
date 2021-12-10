package com.monocept.model.test;

import org.junit.Assert;
import org.junit.Test;

import com.monocept.model.Calculator;

public class CalculatorUnitTest {

	@Test
	public void addPositiveNumber_ShouldGive3_ForInput_1_2() {
		// Arrange
		Calculator calc = new Calculator();
		int exceptionHappened = 3;
		int firstInput = 1;
		int secondInput = 2;
		int result;

		// Act
		result = calc.addPositiveNumber(firstInput, secondInput);

		// Assert
		Assert.assertTrue(result == exceptionHappened);

	}

	@Test
	public void addPositiveNumber_ShouldGiveException_if_FirstInputIsNegative() {
		// Arrange
		Calculator calc = new Calculator();
		boolean exceptionHappened = false;
		int firstInput = -1;
		int secondInput = 2;

		// Act
		try {
			calc.addPositiveNumber(firstInput, secondInput);
		} catch (Exception e) {
			exceptionHappened = true;
		}

		// Assert
		Assert.assertTrue(exceptionHappened);

	}
	
	@Test
	public void addPositiveNumber_ShouldGiveException_if_SecondInputIsNegative() {
		// Arrange
		Calculator calc = new Calculator();
		boolean exceptionHappened = false;
		int firstInput =  1;
		int secondInput = -2;

		// Act
		try {
			calc.addPositiveNumber(firstInput, secondInput);
		} catch (Exception e) {
			exceptionHappened = true;
		}

		// Assert
		Assert.assertTrue(exceptionHappened);

	}
	
	@Test
	public void addPositiveNumber_ShouldGiveException_if_BothInputAreNegative() {
		// Arrange
		Calculator calc = new Calculator();
		boolean exceptionHappened = false;
		int firstInput = -1;
		int secondInput = -2;

		// Act
		try {
			calc.addPositiveNumber(firstInput, secondInput);
		} catch (Exception e) {
			exceptionHappened = true;
		}

		// Assert
		Assert.assertTrue(exceptionHappened);

	}
	
	@Test
	public void addPositiveNumberForTwoDigits_ShouldGive30_For_10_20() {
		// Arrange
		Calculator calc = new Calculator();
		int exceptionHappened = 30;
		int firstInput = 10;
		int secondInput = 20;
		int result;

		// Act
			result = calc.addPositiveNumber(firstInput, secondInput);

		// Assert
		Assert.assertTrue(result == exceptionHappened);

	}

}
