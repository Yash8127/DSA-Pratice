package com.array;

import java.util.Arrays;

public class PrefixRangeSum {

	public static void main(String[] args) {
		int arr[] = { 5,10,20,50,100 };
		int prefixSum[] = new int[arr.length];
		prefixSum[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		}
		System.out.println(Arrays.toString(prefixSum));
		int l = 2;
		int r = 3;
		int sum = 0;
		if (l == 0) {
			sum = prefixSum[r];
		} else {
			sum = prefixSum[r] - prefixSum[l - 1];
		}
		System.out.println("prefix Range Sum: " + sum);
	}

}
