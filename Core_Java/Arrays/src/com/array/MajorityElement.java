package com.array;

public class MajorityElement {
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,2,2,2,2,2,2,2};
		int currentElement = arr[0];
		int count = 0;
		System.out.println(arr.length/2+","+arr.length);
		for(int i=0;i<arr.length;i++) {
			if(currentElement == arr[i]) {
				count++;
			}
			
			else if(count == 0) {
				currentElement = arr[i];
				count++;
			}
			else
				count--;
		}
		
		if(count >= arr.length/2) {
			System.out.println(currentElement);
		}
	}
	
}
