package com.array;

public class SmallestNumber {

	public static void main(String[] args) {
		int number = 81000;
		StringBuffer num = new StringBuffer();
		String ans = "";

		for (int i = 9; i >= 2;) {
			if (number % i == 0) {
				num.append(i);
				ans = i + ans;
				number = number / i;
			} else {
				i--;
			}
		}
		if (number != 1) {
			System.out.println(-1);
		}
		else {
			System.out.println(num.reverse()+",,,"+ans);
		}
	}

}
