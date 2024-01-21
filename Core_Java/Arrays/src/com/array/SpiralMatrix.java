package com.array;

public class SpiralMatrix {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 ,4}, 
						{ 5, 6, 7 ,8}, 
						{ 9, 10, 11,12} 
					};

		int cmin = 0;
		int rmin = 0;
		int n = arr.length, rmax = arr.length-1;
		int m = arr[0].length, cmax = arr[0].length-1;
		int count = 0;
		System.out.println(n+""+m+""+rmax+""+cmax);

		while (count < n * m) {
			for (int col = cmin; col <= cmax && count < n * m; col++) {
				System.out.print(arr[rmin][col] + " ");
				count++;
			}
			rmin++;

			for (int row = rmin; row <= rmax && count < n * m; row++) {
				System.out.print(arr[row][cmax] + " ");
				count++;
			}
			cmax--;

			for (int col = cmax; col >= cmin && count < n * m; col--) {
				System.out.print(arr[rmax][col] + " ");
				count++;
			}
			rmax--;

			for (int row = rmax; row >= rmin && count < n * m; row--) {
				System.out.print(arr[row][cmin] + " ");
				count++;
			}
			cmin++;
		}

	}
}
