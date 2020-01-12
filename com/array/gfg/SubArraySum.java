package com.array.gfg;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SubArraySum {
	public static final Scanner in = new Scanner(System.in);

	static Integer[] getRes(int[] arr, int sum) {
		int s = 0;
		Integer[] res = new Integer[2];
		int l = 0, r = 0;
		for (r = 0; r < arr.length; r++) {
			s += arr[r];
			while (s > sum && l <= r) {
				s -= arr[l];
				l++;
			}
			if (s == sum) {
				res[0] = l + 1;
				res[1] = r + 1;
				return res;
			}
			if (l == r && s > sum) {
				s = 0;
				l++;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int q = in.nextInt();
		while (q-- > 0) {
			int n = in.nextInt();
			int s = in.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}

			Integer[] res = getRes(arr, s);
			if (res == null)
				System.out.println(-1);
			else
				System.out.println(res[0] + " " + res[1]);
		}
	}
}