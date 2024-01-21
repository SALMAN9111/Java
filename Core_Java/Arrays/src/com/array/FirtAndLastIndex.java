package com.array;

public class FirtAndLastIndex {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 7, 7, 7, 8, 8, 8, 8, 8 };
		int target = 7;
		int left = 0;
		int rigth = arr.length - 1;
		int first = 0;
		int last = 0;

		// boss binary search array should be in sorted order remember

		while (left <= rigth) {
			int mid = (left + rigth) / 2;
			if (arr[mid] == target) {
				first = mid;
				rigth = mid - 1;
			} else if (arr[mid] > target) {
				rigth = mid - 1;
			} else {
				left = mid + 1;
			}
		}

//		left = 0;
		rigth = arr.length - 1;

		while (left <= rigth) {
			int mid = (left + rigth) / 2;

			if (arr[mid] == target) {
				left = mid + 1; // got replace last = mid;
//				left = mid + 1;
			} else if (arr[mid] > target) {
				rigth = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		System.out.println(first + "," + --left + "," + arr[first] + "," + arr[left]);

	}

}
