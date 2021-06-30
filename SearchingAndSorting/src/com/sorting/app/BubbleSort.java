package com.sorting.app;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };

		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		bubbleSort(arr);// sorting array elements using bubble sort

		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				int temp;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
