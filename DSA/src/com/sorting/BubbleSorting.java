package com.sorting;

import java.util.Arrays;

public class BubbleSorting {

    public static void main(String[] args) {

        int[] arr = {8, 5, 4, 3, 2};

        int n = arr.length;
        int count = 0;   // Outer loop passes
        int count1 = 0;  // Swaps

        for (int i = 0; i < n - 1; i++) {

            boolean swap = false;
            count++;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swap = true;
                    count1++;
                }
            }

            if (!swap) {
                break;
            }
        }

        System.out.println("Outer Passes : " + count);
        System.out.println("Total Swaps  : " + count1);
		System.out.println(Arrays.toString(arr));
	}
}