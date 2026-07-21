package com.sorting;

import java.util.Scanner;

public class LinearSearch {

	private static int search(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		int arr[] = { 3, 4, 2, 7, 9, 12, 33 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Key: ");
		int key = sc.nextInt();
		System.out.println("key index is " + search(arr, key));
	}

}
