package com.array;

public class MinValInSortedAndRotateArray {

	public static void main(String[] args) {
		int[] arr1 = {12,11,10,9,8,7,6,1,2,3,4,5};
//		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		
		int left = 0;
		int rigth = arr1.length-1;
		
		while(left < rigth) {  // through binary search log2
			int mid = (left + rigth) / 2;
			
			if(arr1[mid] > arr1[rigth]) {
				left = mid + 1;
			}
			else {
				rigth = mid - 1;
			}
		}
		
		System.out.println(arr1[rigth]+","+arr1[left]);
		
		int min = arr1[0];// linear approach N
		for(int i=0;i<arr1.length-1;i++) {
			if(arr1[i] > arr1[i+1]) {
				min = arr1[i+1];
			}
		}
		
		System.out.println(min);
		
		
	}
	
}
