package com.array.gfg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountTheTriplets {
	private static Scanner in = new Scanner(System.in);
	
	private static int algo(Integer[] arr) {
		int tripletCount = 0;
		Map<Integer, Boolean> map = new HashMap<>();
		for(int i : arr)
			map.put(i, true);
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++)
				if(map.containsKey(arr[i] + arr[j]))
					tripletCount++;
		}
		return tripletCount > 0 ? tripletCount : -1;
	}
	public static void main(String[] args) {
		int q = in.nextInt();
		while(q-- > 0) {
			int n = in.nextInt();
			Integer[] arr = new Integer[n];
			for(int i = 0; i < n; i++)
				arr[i] = in.nextInt();
			
			System.out.println(algo(arr));
		}
	}
}
