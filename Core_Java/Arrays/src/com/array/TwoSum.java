package com.array;

import java.util.HashMap;

public class TwoSum {
	
	public static void main(String[] args) {
		int[] arr = {2,5,4,3,8,7};
		int target = 7;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(target - arr[i])) {
				System.out.println("Indexes "+map.get(target - arr[i])+","+i);
				System.out.println("Value "+arr[map.get(target - arr[i])]+","+arr[i]);
			}
			map.put(arr[i], i);
		}
	}

}
