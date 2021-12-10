package com.monocept.test;

public class ExceptionTest {
	public static void main(String[] args) {
		System.out.println("Developed by SALMAN");
		
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = a/b;
			System.out.println(result);
			//main(args);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index value is out of bound. It maybe due to either you have not provided value or provide value in wrong index.");
		}
		
		catch(ArithmeticException e) {
			System.out.println("Denominator value zero is not accepted. Give a whole number other then Zero.");
		}
		
		catch(NumberFormatException x) {
			System.out.println("Program accepts only integer value. Please enter integer values next time.");
		}
		
		catch(Exception xp) {
			System.out.println(xp.getMessage());
		}
		System.out.println("Thank you for using my app.");
		System.out.println("End.");
		
	}

}
/*Exceptions:
1) java.lang.ArrayIndexOutOfBoundsException: 0 at line number: 5
2) java.lang.ArithmeticException: / by zero at line number: 8
3) java.lang.NumberFormatException: For input string: "2.0" at line number: 6
*/