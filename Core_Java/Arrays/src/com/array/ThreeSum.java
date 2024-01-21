package com.array;

import java.util.Arrays;

public class ThreeSum {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 7, 8 };
		int target = 9;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || (arr[i] != arr[i - 1])) {
				int k = arr.length - 1;
				int j = i + 1;
				while (j < k) {
					if (arr[j] + arr[k] == (target - arr[i])) {
						System.out.println(i + "" + j + "" + k);
						while (j < k && arr[j] == arr[j + 1])
							j++;
						while (j < k && arr[k] == arr[k + 1])
							k--;
						j++;
						k--;

					} else if (arr[j] + arr[k] > target - arr[i]) {
						k--;
					} else {
						j++;
					}
				}
			}
		}

	}

}
