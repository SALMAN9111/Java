package com.monocept.test;

public class IntegerArrayTest {
	public static void main(String[] args) {
		int[] marksArray = {50,23,45,6,3,57,57};
		int n = marksArray.length;
	    
		int max = 0;
		for(int i=0; i<n; i++) {
			if(marksArray[i]>max) {
				max = marksArray[i];
			}
		}
		
		int secondMax = 0;
		for(int i=0; i<n; i++) {
			if(marksArray[i] < max && marksArray[i] > secondMax) {
				secondMax = marksArray[i];
			}
		}
		
	    System.out.println("Max number of given array is "+max);
	    System.out.println("Second max number of given array is "+secondMax);
	    
	    }
	    
	    
	}
	
	
	
	


