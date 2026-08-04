package com.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 3, 1, 6, 7 };
		System.out.println("Before Sorting :" + Arrays.toString(arr));

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];// 1
			int j = i;// 1
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;

			}
			arr[j] = temp;
		}
		System.out.println("After Sorting :" + Arrays.toString(arr));
	}

}
