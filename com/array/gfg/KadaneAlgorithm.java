package com.array.gfg;

import java.util.Scanner;

public class KadaneAlgorithm {
	private static Scanner in = new Scanner(System.in);
	
	private static int algo(int[] arr) {
		int maxSoFar = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			maxSoFar = Math.max(maxSoFar + arr[i], arr[i]);
			max = Math.max(max, maxSoFar);
		}
		return max;
	}

	public static void main(String[] args) {
		int q = in.nextInt();
		while(q-- > 0) {
			int n = in.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++)
				arr[i] = in.nextInt();
			
			System.out.println(algo(arr));
		}
	}
}
