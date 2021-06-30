package com.sorting.app;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
		System.out.println("Before Insertion Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();

		insertionSort(arr1);// sorting array using insertion sort

		System.out.println("After Insertion Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}

	private static void insertionSort(int[] arr) {
		int n = arr.length;
		int key, j;
		for (int i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

}
