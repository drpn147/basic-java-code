package com.sorting.app;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
		System.out.println("Before Selection Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();

		selectionSort(arr1);// sorting array using selection sort

		System.out.println("After Selection Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}

	private static void selectionSort(int[] arr) {
		int min;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

}
