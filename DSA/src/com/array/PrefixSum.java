package com.array;

import java.util.Arrays;

public class PrefixSum {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5 };
		int prefixSum[] = new int[arr.length];
		prefixSum[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		}
		System.out.println(Arrays.toString(prefixSum));
	}

}
