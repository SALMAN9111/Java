package com.array;

import java.util.Arrays;

public class Rotate90Deg {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 5, 6, 7 }, { 9, 10, 11 } };
		System.out.println("" + arr[0].length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));

		int left = 0;
		int rigth = arr[0].length - 1;
		while (left < rigth) {
			for (int i = 0; i < arr.length; i++) {
				int temp = arr[i][left];
				arr[i][left] = arr[i][rigth];
				arr[i][rigth] = temp;
			}
			left++;
			rigth--;
		}

//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length/2;j++) {
//				int temp = arr[i][j];
//				arr[i][j] = arr[i][arr.length-1];
//				arr[i][arr.length-1] = temp;
//			}
//		}

		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
	}
}
