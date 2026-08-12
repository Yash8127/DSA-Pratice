package com.sorting;

public class QuickSorting {

	public static void main(String[] args) {

		int arr[] = { 8, 7, 5, 4, 3 };
		quickSort(arr, 0, arr.length - 1);
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(arr, low, high);
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int start = low;
		int end = high;
		while (start < end) {
			while (start <= high && arr[start] <= pivot) {
				start++;
			}
			while (arr[end] > pivot) {
				end--;
			}
			if (start < end) {
				swap(arr, start, end);
			}
		}
		swap(arr, low, end);
		return end;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
