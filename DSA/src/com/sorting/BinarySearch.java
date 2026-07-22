package com.sorting;

import java.util.Scanner;

public class BinarySearch {

	private static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (key < arr[mid])
				high = mid - 1;
			else
				low = mid + 1;

		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Enter a key: ");
		int key = sc.nextInt();
		System.out.println("Element found at: " + binarySearch(arr, key));
	}

}
